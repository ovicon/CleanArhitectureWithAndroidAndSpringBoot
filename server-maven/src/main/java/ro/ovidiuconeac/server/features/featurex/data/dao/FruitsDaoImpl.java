package ro.ovidiuconeac.server.features.featurex.data.dao;

import ro.ovidiuconeac.server.features.featurex.data.database.Database;
import ro.ovidiuconeac.server.features.featurex.data.database.DatabaseImpl;
import ro.ovidiuconeac.server.features.featurex.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FruitsDaoImpl implements FruitsDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Fruit getFruitById(int id) {
        return database.getFruitById(id);
    }
}
