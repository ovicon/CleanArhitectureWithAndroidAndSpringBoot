package ro.ovidiuconeac.server.features.featurex.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.featurex.data.dao.FruitsDao;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class FruitsBeanImpl implements FruitsBean {

    @Autowired
    private FruitsDao dao;

    @Override
    public Fruit getRandomFruit() {
        return dao.getRandomFruit();
    }
}
