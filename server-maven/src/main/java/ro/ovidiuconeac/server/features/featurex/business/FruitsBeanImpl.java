package ro.ovidiuconeac.server.features.featurex.business;

import ro.ovidiuconeac.server.features.featurex.data.dao.FruitsDao;
import ro.ovidiuconeac.server.features.featurex.data.dao.FruitsDaoImpl;
import ro.ovidiuconeac.server.features.featurex.models.Fruit;

import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FruitsBeanImpl implements FruitsBean {

    private FruitsDao dao;

    public FruitsBeanImpl() {
        dao = new FruitsDaoImpl();
    }

    @Override
    public Fruit getRandomFruit() {
        int id = new Random().nextInt(14);
        return dao.getFruitById(id);
    }
}
