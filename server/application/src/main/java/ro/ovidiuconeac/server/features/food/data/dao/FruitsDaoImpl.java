package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.server.features.food.data.entities.FruitEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;

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

    public FruitsDaoImpl() {
        random = new Random();
    }

    @Override
    @SuppressWarnings("unchecked")
    public FruitEntity getRandomFruit() throws FruitNotFoundException {
        Query query = entityManager.createQuery("SELECT f FROM fruit f");
        List<FruitEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new FruitNotFoundException();
        }
        return result.get(random.nextInt(result.size() - 1));
    }
}
