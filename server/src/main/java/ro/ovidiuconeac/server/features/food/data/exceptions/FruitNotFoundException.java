package ro.ovidiuconeac.server.features.food.data.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class FruitNotFoundException extends Exception {

    public FruitNotFoundException() {
        super("No fruits found in database");
    }
}
