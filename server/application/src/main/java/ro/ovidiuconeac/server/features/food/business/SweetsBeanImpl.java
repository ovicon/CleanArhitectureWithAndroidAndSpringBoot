package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.data.dao.SweetsDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class SweetsBeanImpl implements SweetsBean {

    private final SweetsDao dao;

    // Better for testing
    @Autowired
    public SweetsBeanImpl(SweetsDao dao) {
        this.dao = dao;
    }

    @Override
    public Sweet getRandomSweet() throws NoResultException {
        Sweet sweet;
        try {
            sweet = dao.getRandomSweet();
        } catch (SweetNotFoundException e) {
            throw new NoResultException();
        }
        return sweet;
    }
}
