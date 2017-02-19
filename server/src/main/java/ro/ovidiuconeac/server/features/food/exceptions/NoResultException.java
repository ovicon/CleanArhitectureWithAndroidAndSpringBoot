package ro.ovidiuconeac.server.features.food.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No result found in database")
public class NoResultException extends Exception {

    private static final long serialVersionUID = 100L;

    public NoResultException() {
        super("No result found in database");
    }
}
