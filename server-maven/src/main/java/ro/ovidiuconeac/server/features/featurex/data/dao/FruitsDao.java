package ro.ovidiuconeac.server.features.featurex.data.dao;

import ro.ovidiuconeac.server.features.featurex.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsDao {
    Fruit getFruitById(int id);
}
