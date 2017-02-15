package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.featurex.data.entities.SweetEntity;
import ro.ovidiuconeac.server.features.featurex.data.transformers.SweetTransformer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Repository
public class SweetsDaoImpl implements SweetsDao {

    @PersistenceContext
    private EntityManager entityManager;
    private Random random;
    private SweetTransformer transformer;

    public SweetsDaoImpl() {
        random = new Random();
        transformer = new SweetTransformer();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Sweet getRandomSweet() {
        String sql = "SELECT s FROM sweet s";
        Query query = entityManager.createQuery(sql);
        List<SweetEntity> result = query.getResultList();
        SweetEntity entity = result.get(random.nextInt(14));
        return transformer.getModelFrom(entity);
    }
}
