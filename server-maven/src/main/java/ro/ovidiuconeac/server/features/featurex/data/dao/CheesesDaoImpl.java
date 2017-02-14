package ro.ovidiuconeac.server.features.featurex.data.dao;

import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.featurex.data.database.Database;
import ro.ovidiuconeac.server.features.featurex.data.database.DatabaseImpl;

/**
 * Created by ovidiu on 2/7/17.
 */

public class CheesesDaoImpl implements CheesesDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Cheese getCheeseById(int id) {
        return database.getCheeseById(id);
    }
}
