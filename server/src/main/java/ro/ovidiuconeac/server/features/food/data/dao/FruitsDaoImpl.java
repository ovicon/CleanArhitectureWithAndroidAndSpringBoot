package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.data.entities.FruitEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;
import ro.ovidiuconeac.server.features.food.data.transformers.FruitTransformer;

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
    public Fruit getRandomFruit() throws FruitNotFoundException {
        Fruit fruit;
        Query query = entityManager.createQuery("SELECT f FROM fruit f");
        List<FruitEntity> result = query.getResultList();
        if (result != null && !result.isEmpty()) {
            FruitEntity entity = result.get(random.nextInt(result.size() - 1));
            fruit = transformer.getModelFrom(entity);
        } else {
            throw new FruitNotFoundException();
        }
        return fruit;
    }
}
