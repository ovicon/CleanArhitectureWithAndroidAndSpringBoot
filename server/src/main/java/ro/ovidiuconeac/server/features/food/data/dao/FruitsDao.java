package ro.ovidiuconeac.server.features.food.data.dao;

import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsDao {
    Fruit getRandomFruit() throws FruitNotFoundException;
}
