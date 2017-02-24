package ro.ovidiuconeac.server.features.food.data.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class SweetNotFoundException extends Exception {

    public SweetNotFoundException() {
        super("No sweets found in database");
    }
}
