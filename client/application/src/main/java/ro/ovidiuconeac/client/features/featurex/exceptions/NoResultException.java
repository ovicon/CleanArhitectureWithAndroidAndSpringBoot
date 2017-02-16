package ro.ovidiuconeac.client.features.featurex.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */

public class NoResultException extends Exception {

    public NoResultException() {
        super("No result exception. Data was not found on the server.");
    }
}
