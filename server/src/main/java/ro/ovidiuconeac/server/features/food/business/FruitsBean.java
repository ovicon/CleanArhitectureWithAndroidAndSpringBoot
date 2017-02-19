package ro.ovidiuconeac.server.features.food.business;

import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsBean {
    Fruit getRandomFruit() throws NoResultException;
}
