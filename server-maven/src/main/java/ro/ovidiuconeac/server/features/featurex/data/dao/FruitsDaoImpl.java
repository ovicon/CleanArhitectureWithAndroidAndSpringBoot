package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.featurex.data.entities.FruitEntity;
import ro.ovidiuconeac.server.features.featurex.data.transformers.FruitTransformer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Repository
public class FruitsDaoImpl implements FruitsDao {

    @PersistenceContext
    private EntityManager entityManager;
    private Random random;
    private FruitTransformer transformer;

    public FruitsDaoImpl() {
        random = new Random();
        transformer = new FruitTransformer();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Fruit getRandomFruit() {
        String sql = "SELECT f FROM fruit f";
        Query query = entityManager.createQuery(sql);
        List<FruitEntity> result = query.getResultList();
        FruitEntity entity = result.get(random.nextInt(14));
        return transformer.getModelFrom(entity);
    }
}
