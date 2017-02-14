package ro.ovidiuconeac.server.features.featurex.business;

import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.featurex.data.dao.SweetsDao;
import ro.ovidiuconeac.server.features.featurex.data.dao.SweetsDaoImpl;

import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */

public class SweetsBeanImpl implements SweetsBean {

    private SweetsDao dao;

    public SweetsBeanImpl() {
        dao = new SweetsDaoImpl();
    }

    @Override
    public Sweet getRandomSweet() {
        int id = new Random().nextInt(14);
        return dao.getSweetById(id);
    }
}
