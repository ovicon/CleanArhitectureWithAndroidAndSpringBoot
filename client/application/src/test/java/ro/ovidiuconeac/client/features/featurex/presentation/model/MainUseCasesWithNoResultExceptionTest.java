package ro.ovidiuconeac.client.features.featurex.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ro.ovidiuconeac.client.features.featurex.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;
import ro.ovidiuconeac.client.features.featurex.rest.RestServiceApi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class MainUseCasesWithNoResultExceptionTest {

    private MainUseCases mainUseCases;

    @Before
    public void setUp() {
        mainUseCases = Mockito.mock(MainUseCases.class);
    }

    @After
    public void tearDown() {
        mainUseCases = null;
    }

    @Test
    public void testGetFruit1WithRequestException() {
        try {
            when(mainUseCases.getFruit1(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getFruit1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }

    @Test
    public void testGetFruit2WithRequestException() {
        try {
            when(mainUseCases.getFruit2(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getFruit2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese1WithRequestException() {
        try {
            when(mainUseCases.getCheese1(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getCheese1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese2WithRequestException() {
        try {
            when(mainUseCases.getCheese2(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getCheese2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet1WithRequestException() {
        try {
            when(mainUseCases.getSweet1(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getSweet1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet2WithRequestException() {
        try {
            when(mainUseCases.getSweet2(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            mainUseCases.getSweet2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("No result exception. Data was not found on the server.", e.getMessage());
        }
    }
}