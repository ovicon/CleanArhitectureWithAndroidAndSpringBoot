package ro.ovidiuconeac.server.features.featurex.data.dao;

import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.models.features.featurex.Sweet;

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

    private Random random = new Random();

    @Override
    public Sweet getRandomSweet() {
        Query query = entityManager.createNamedQuery("SELECT * FROM sweets");
        List<Sweet> result = query.getResultList();
        return result.get(random.nextInt(14));
    }
}
