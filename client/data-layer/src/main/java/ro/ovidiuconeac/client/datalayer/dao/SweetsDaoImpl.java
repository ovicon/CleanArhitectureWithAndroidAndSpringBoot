package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.datalayer.database.Database;
import ro.ovidiuconeac.client.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class SweetsDaoImpl implements SweetsDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Sweet getSweetById(int id) {
        return database.getSweetById(id);
    }
}
