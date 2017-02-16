package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.food.data.entities.SweetEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;
import ro.ovidiuconeac.server.features.food.data.transformers.SweetTransformer;

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
    public Sweet getRandomSweet() throws SweetNotFoundException {
        Sweet sweet = null;
        Query query = entityManager.createQuery("SELECT s FROM sweet s");
        List<SweetEntity> result = query.getResultList();
        if (result != null && !result.isEmpty()) {
            SweetEntity entity = result.get(random.nextInt(result.size() - 1));
            sweet = transformer.getModelFrom(entity);
        } else {
            throw new SweetNotFoundException();
        }
        return sweet;
    }
}
