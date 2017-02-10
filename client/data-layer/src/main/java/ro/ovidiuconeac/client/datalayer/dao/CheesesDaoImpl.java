package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.datalayer.database.Database;
import ro.ovidiuconeac.client.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.client.models.Cheese;

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
