package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Fruit;

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

    private Random random = new Random();

    @Override
    public Fruit getRandomFruit() {
        Query query = entityManager.createNamedQuery("SELECT * FROM fruits");
        List<Fruit> result = query.getResultList();
        return result.get(random.nextInt(14));
    }
}
