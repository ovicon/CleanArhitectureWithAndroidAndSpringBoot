package ro.ovidiuconeac.client.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.client.datalayer.dao.CheesesDao;
import ro.ovidiuconeac.client.datalayer.dao.CheesesDaoImpl;
import ro.ovidiuconeac.client.models.Cheese;

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
