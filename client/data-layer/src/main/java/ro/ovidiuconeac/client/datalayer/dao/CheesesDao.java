package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.models.Cheese;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesDao {
    Cheese getCheeseById(int id);
}
