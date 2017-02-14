package ro.ovidiuconeac.server.features.featurex.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.featurex.data.dao.SweetsDao;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class SweetsBeanImpl implements SweetsBean {

    @Autowired
    private SweetsDao dao;

    @Override
    public Sweet getRandomSweet() {
        return dao.getRandomSweet();
    }
}
