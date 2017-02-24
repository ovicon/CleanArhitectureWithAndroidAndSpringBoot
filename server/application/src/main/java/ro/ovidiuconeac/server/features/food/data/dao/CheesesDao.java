package ro.ovidiuconeac.server.features.food.data.dao;

import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.server.features.food.data.exceptions.CheeseNotFoundException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesDao {
    Cheese getRandomCheese() throws CheeseNotFoundException;
}
