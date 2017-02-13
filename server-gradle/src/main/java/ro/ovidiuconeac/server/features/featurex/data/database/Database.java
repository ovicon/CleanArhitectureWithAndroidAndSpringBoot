package ro.ovidiuconeac.server.features.featurex.data.database;

import ro.ovidiuconeac.server.features.featurex.models.Cheese;
import ro.ovidiuconeac.server.features.featurex.models.Fruit;
import ro.ovidiuconeac.server.features.featurex.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface Database {
    Fruit getFruitById(int id);
    Cheese getCheeseById(int id);
    Sweet getSweetById(int id);
}
