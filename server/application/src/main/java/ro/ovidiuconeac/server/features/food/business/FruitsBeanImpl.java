package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.data.dao.FruitsDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class FruitsBeanImpl implements FruitsBean {

    private final FruitsDao dao;

    // Better for testing
    @Autowired
    public FruitsBeanImpl(FruitsDao dao) {
        this.dao = dao;
    }

    @Override
    public Fruit getRandomFruit() throws NoResultException {
        Fruit fruit;
        try {
            fruit = dao.getRandomFruit();
        } catch (FruitNotFoundException e) {
            throw new NoResultException();
        }
        return fruit;
    }
}
