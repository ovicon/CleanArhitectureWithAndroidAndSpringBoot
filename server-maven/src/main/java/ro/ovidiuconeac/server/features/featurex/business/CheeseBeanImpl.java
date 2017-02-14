package ro.ovidiuconeac.server.features.featurex.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.featurex.data.dao.CheesesDao;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class CheeseBeanImpl implements CheeseBean {

    @Autowired
    private CheesesDao dao;

    @Override
    public Cheese getRandomCheese() {
        return dao.getRandomCheese();
    }
}
