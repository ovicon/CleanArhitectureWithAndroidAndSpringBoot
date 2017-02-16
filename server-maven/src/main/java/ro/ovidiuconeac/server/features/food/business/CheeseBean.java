package ro.ovidiuconeac.server.features.food.business;

import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheeseBean {
    Cheese getRandomCheese() throws NoResultException;
}
