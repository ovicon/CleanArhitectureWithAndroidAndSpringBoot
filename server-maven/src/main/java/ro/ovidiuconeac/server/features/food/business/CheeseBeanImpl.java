package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.food.data.dao.CheesesDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class CheeseBeanImpl implements CheeseBean {

    @Autowired
    private CheesesDao dao;

    @Override
    public Cheese getRandomCheese() throws NoResultException {
        Cheese cheese;
        try {
            cheese = dao.getRandomCheese();
        } catch (CheeseNotFoundException e) {
            throw new NoResultException();
        }
        return cheese;
    }
}
