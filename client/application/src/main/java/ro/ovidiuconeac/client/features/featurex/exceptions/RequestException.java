package ro.ovidiuconeac.client.features.featurex.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */

public class RequestException extends Exception {

    public RequestException() {
        super("Request exception. Unable to contact server.");
    }
}
