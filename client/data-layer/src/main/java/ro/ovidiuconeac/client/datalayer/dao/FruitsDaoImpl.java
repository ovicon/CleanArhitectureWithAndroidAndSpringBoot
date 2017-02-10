package ro.ovidiuconeac.client.datalayer.dao;

import ro.ovidiuconeac.client.datalayer.database.Database;
import ro.ovidiuconeac.client.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.client.models.Fruit;

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
