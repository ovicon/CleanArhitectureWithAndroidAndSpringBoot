package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Cheese;

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

    private Random random = new Random();

    @Override
    public Cheese getRandomCheese() {
        Query query = entityManager.createNativeQuery("SELECT a.id, a.name FROM cheeses a");
        List<Cheese> result = query.getResultList();
        return result.get(random.nextInt(14));
    }
}