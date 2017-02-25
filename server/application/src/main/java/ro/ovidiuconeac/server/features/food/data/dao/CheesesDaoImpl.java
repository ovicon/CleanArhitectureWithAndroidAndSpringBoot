package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.server.features.food.data.entities.CheeseEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;

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

    public CheesesDaoImpl() {
        random = new Random();
    }

    @Override
    @SuppressWarnings("unchecked")
    public CheeseEntity getRandomCheese() throws CheeseNotFoundException {
        Query query = entityManager.createQuery("SELECT c FROM cheese c");
        List<CheeseEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new CheeseNotFoundException();
        }
        return result.get(random.nextInt(result.size() - 1));
    }
}