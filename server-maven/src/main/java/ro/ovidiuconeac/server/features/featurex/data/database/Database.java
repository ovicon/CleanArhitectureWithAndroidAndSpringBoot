package ro.ovidiuconeac.server.features.featurex.data.database;

import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface Database {
    Fruit getFruitById(int id);
    Cheese getCheeseById(int id);
    Sweet getSweetById(int id);
}
