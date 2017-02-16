package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.food.data.entities.CheeseEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;
import ro.ovidiuconeac.server.features.food.data.transformers.CheeseTransformer;

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
    public Cheese getRandomCheese() throws CheeseNotFoundException {
        Cheese cheese;
        Query query = entityManager.createQuery("SELECT c FROM cheese c");
        List<CheeseEntity> result = query.getResultList();
        if (result != null && !result.isEmpty()) {
            CheeseEntity entity = result.get(random.nextInt(result.size() - 1));
            cheese = transformer.getModelFrom(entity);
        } else {
            throw new CheeseNotFoundException();
        }
        return cheese;
    }
}