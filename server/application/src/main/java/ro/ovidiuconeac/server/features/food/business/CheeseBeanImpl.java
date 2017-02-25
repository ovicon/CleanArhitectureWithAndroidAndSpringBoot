package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.server.features.food.data.dao.CheesesDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;
import ro.ovidiuconeac.server.features.food.data.transformers.CheeseTransformer;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class CheeseBeanImpl implements CheeseBean {

    private final CheesesDao dao;
    private CheeseTransformer transformer;

    // Better for testing
    @Autowired
    public CheeseBeanImpl(CheesesDao dao) {
        this.dao = dao;
        this.transformer = new CheeseTransformer();
    }

    @Override
    public Cheese getRandomCheese() throws NoResultException {
        Cheese cheese;
        try {
            cheese = transformer.getModelFrom(dao.getRandomCheese());
        } catch (CheeseNotFoundException e) {
            throw new NoResultException();
        }
        return cheese;
    }
}
