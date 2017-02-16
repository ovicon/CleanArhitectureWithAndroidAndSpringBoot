package ro.ovidiuconeac.server.features.food.data.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class CheeseNotFoundException extends Exception {

    public CheeseNotFoundException() {
        super("No cheeses found in database");
    }
}
