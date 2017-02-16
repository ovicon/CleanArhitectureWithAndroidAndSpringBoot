package ro.ovidiuconeac.client.features.featurex.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import ro.ovidiuconeac.client.features.featurex.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;
import ro.ovidiuconeac.client.features.featurex.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class MainUseCasesTest {

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
    public void testGetFruit1() {
        try {
            Fruit fruit = new Fruit("Banana");
            when(mainUseCases.getFruit1(any(RestServiceApi.class))).thenReturn(fruit);
            Fruit result = mainUseCases.getFruit1(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Banana", fruit.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetFruit2() {
        try {
            Fruit fruit = new Fruit("Cherries");
            when(mainUseCases.getFruit2(any(RestServiceApi.class))).thenReturn(fruit);
            Fruit result = mainUseCases.getFruit2(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cherries", fruit.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheese1() {
        try {
            Cheese cheese = new Cheese("Telemea");
            when(mainUseCases.getCheese1(any(RestServiceApi.class))).thenReturn(cheese);
            Cheese result = mainUseCases.getCheese1(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Telemea", cheese.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheese2() {
        try {
            Cheese cheese = new Cheese("Cas");
            when(mainUseCases.getCheese2(any(RestServiceApi.class))).thenReturn(cheese);
            Cheese result = mainUseCases.getCheese2(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cas", cheese.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetSweet1() {
        try {
            Sweet sweet = new Sweet("Dobos");
            when(mainUseCases.getSweet1(any(RestServiceApi.class))).thenReturn(sweet);
            Sweet result = mainUseCases.getSweet1(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Dobos", sweet.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetSweet2() {
        try {
            Sweet sweet = new Sweet("Cremes");
            when(mainUseCases.getSweet2(any(RestServiceApi.class))).thenReturn(sweet);
            Sweet result = mainUseCases.getSweet2(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cremes", sweet.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }
}