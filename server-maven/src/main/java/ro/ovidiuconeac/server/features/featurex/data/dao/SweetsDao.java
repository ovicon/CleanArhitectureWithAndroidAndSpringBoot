package ro.ovidiuconeac.server.features.featurex.data.dao;

import ro.ovidiuconeac.server.features.featurex.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsDao {
    Sweet getSweetById(int id);
}
