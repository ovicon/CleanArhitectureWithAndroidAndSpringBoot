package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.data.dao.SweetsDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Component
public class SweetsBeanImpl implements SweetsBean {

    @Autowired
    private SweetsDao dao;

    @Override
    public Sweet getRandomSweet() throws NoResultException {
        Sweet sweet;
        try {
            sweet = dao.getRandomSweet();
        } catch (SweetNotFoundException e) {
            throw new NoResultException();
        }
        return sweet;
    }
}
