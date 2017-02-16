package ro.ovidiuconeac.server.features.food.data.dao;

import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsDao {
    Sweet getRandomSweet() throws SweetNotFoundException;
}
