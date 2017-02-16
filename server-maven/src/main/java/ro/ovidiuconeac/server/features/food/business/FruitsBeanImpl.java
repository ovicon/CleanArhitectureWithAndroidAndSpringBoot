package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.food.data.dao.FruitsDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class FruitsBeanImpl implements FruitsBean {

    @Autowired
    private FruitsDao dao;

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
