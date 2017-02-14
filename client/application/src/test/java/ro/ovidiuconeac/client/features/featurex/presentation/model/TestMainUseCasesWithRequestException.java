package ro.ovidiuconeac.client.features.featurex.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestMainUseCasesWithRequestException {

    private MainUseCases mainUseCases;

    @Before
    public void init() {
        mainUseCases = Mockito.mock(MainUseCases.class);
    }

    @After
    public void deinit() {
        mainUseCases = null;
    }

    @Test
    public void testGetFruit1WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getFruit1()).thenThrow(requestException);
            mainUseCases.getFruit1();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetFruit2WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getFruit2()).thenThrow(requestException);
            mainUseCases.getFruit2();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese1WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getCheese1()).thenThrow(requestException);
            mainUseCases.getCheese1();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese2WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getCheese2()).thenThrow(requestException);
            mainUseCases.getCheese2();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet1WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getSweet1()).thenThrow(requestException);
            mainUseCases.getSweet1();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet2WithRequestException() {
        try {
            RequestException requestException = new RequestException();
            when(mainUseCases.getSweet2()).thenThrow(requestException);
            mainUseCases.getSweet2();
        } catch (RequestException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }
}