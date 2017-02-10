package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsDao {
    Fruit getFruitById(int id);
}
