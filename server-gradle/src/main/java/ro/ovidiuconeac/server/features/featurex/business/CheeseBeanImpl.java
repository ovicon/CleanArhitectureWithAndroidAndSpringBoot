package ro.ovidiuconeac.server.features.featurex.business;

import ro.ovidiuconeac.server.features.featurex.data.dao.CheesesDao;
import ro.ovidiuconeac.server.features.featurex.data.dao.CheesesDaoImpl;
import ro.ovidiuconeac.server.features.featurex.models.Cheese;

import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */

public class CheeseBeanImpl implements CheeseBean {

    private CheesesDao dao;

    public CheeseBeanImpl() {
        dao = new CheesesDaoImpl();
    }

    @Override
    public Cheese getRandomCheese() {
        int id = new Random().nextInt(14);
        return dao.getCheeseById(id);
    }
}
