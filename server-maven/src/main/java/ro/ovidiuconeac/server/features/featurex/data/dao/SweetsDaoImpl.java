package ro.ovidiuconeac.server.features.featurex.data.dao;

import ro.ovidiuconeac.server.features.featurex.data.database.Database;
import ro.ovidiuconeac.server.features.featurex.data.database.DatabaseImpl;
import ro.ovidiuconeac.server.features.featurex.models.Sweet;

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
