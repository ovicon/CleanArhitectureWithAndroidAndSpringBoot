package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsDao {
    Sweet getSweetById(int id);
}
