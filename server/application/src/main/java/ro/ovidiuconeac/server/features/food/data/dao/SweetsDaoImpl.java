package ro.ovidiuconeac.server.features.food.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.server.features.food.data.entities.SweetEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;

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

    public SweetsDaoImpl() {
        random = new Random();
    }

    @Override
    @SuppressWarnings("unchecked")
    public SweetEntity getRandomSweet() throws SweetNotFoundException {
        Query query = entityManager.createQuery("SELECT s FROM sweet s");
        List<SweetEntity> result = query.getResultList();
        if (result == null || result.isEmpty()) {
            throw new SweetNotFoundException();
        }
        return result.get(random.nextInt(result.size() - 1));
    }
}