package ro.ovidiuconeac.server.features.food.data.dao;

import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.data.entities.SweetEntity;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsDao {
    SweetEntity getRandomSweet() throws SweetNotFoundException;
}
