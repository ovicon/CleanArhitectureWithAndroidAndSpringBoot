package ro.ovidiuconeac.client.features.featurex.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestMainUseCases {

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
    public void testGetFruit1() {
        try {
            Fruit fruit = new Fruit("Banana");
            when(mainUseCases.getFruit1()).thenReturn(fruit);
            Fruit result = mainUseCases.getFruit1();
            assertNotNull(result);
            assertEquals("Banana", fruit.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetFruit2() {
        try {
            Fruit fruit = new Fruit("Cherries");
            when(mainUseCases.getFruit2()).thenReturn(fruit);
            Fruit result = mainUseCases.getFruit2();
            assertNotNull(result);
            assertEquals("Cherries", fruit.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheese1() {
        try {
            Cheese cheese = new Cheese("Telemea");
            when(mainUseCases.getCheese1()).thenReturn(cheese);
            Cheese result = mainUseCases.getCheese1();
            assertNotNull(result);
            assertEquals("Telemea", cheese.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheese2() {
        try {
            Cheese cheese = new Cheese("Cas");
            when(mainUseCases.getCheese2()).thenReturn(cheese);
            Cheese result = mainUseCases.getCheese2();
            assertNotNull(result);
            assertEquals("Cas", cheese.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetSweet1() {
        try {
            Sweet sweet = new Sweet("Dobos");
            when(mainUseCases.getSweet1()).thenReturn(sweet);
            Sweet result = mainUseCases.getSweet1();
            assertNotNull(result);
            assertEquals("Dobos", sweet.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetSweet2() {
        try {
            Sweet sweet = new Sweet("Cremes");
            when(mainUseCases.getSweet2()).thenReturn(sweet);
            Sweet result = mainUseCases.getSweet2();
            assertNotNull(result);
            assertEquals("Cremes", sweet.getName());
        } catch (RequestException e) {
            // Force fail
            assertEquals(true, false);
        }
    }
}