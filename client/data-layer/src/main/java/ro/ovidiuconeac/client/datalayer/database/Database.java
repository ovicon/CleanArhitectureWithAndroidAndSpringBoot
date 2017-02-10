package ro.ovidiuconeac.client.datalayer.database;

import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface Database {
    Fruit getFruitById(int id);
    Cheese getCheeseById(int id);
    Sweet getSweetById(int id);
}
