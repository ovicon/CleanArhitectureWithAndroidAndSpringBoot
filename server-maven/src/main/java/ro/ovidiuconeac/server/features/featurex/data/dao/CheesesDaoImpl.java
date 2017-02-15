package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.featurex.data.entities.CheeseEntity;
import ro.ovidiuconeac.server.features.featurex.data.transformers.CheeseTransformer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Repository
public class CheesesDaoImpl implements CheesesDao {

    @PersistenceContext
    private EntityManager entityManager;
    private Random random;
    private CheeseTransformer transformer;

    public CheesesDaoImpl() {
        random = new Random();
        transformer = new CheeseTransformer();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Cheese getRandomCheese() {
        String sql = "SELECT c FROM cheese c";
        Query query = entityManager.createQuery(sql);
        List<CheeseEntity> result = query.getResultList();
        CheeseEntity entity = result.get(random.nextInt(14));
        return transformer.getModelFrom(entity);
    }
}