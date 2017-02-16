package ro.ovidiuconeac.client.features.food.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import ro.ovidiuconeac.client.features.food.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.food.exceptions.RequestException;
import ro.ovidiuconeac.client.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodUseCasesTest {

    private FoodUseCases foodUseCases;

    @Before
    public void setUp() {
        foodUseCases = Mockito.mock(FoodUseCases.class);
    }

    @After
    public void tearDown() {
        foodUseCases = null;
    }

    @Test
    public void testGetFruit1() {
        try {
            Fruit fruit = new Fruit("Banana");
            when(foodUseCases.getFruit1(any(RestServiceApi.class))).thenReturn(fruit);
            Fruit result = foodUseCases.getFruit1(any(RestServiceApi.class));
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
            when(foodUseCases.getFruit2(any(RestServiceApi.class))).thenReturn(fruit);
            Fruit result = foodUseCases.getFruit2(any(RestServiceApi.class));
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
            when(foodUseCases.getCheese1(any(RestServiceApi.class))).thenReturn(cheese);
            Cheese result = foodUseCases.getCheese1(any(RestServiceApi.class));
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
            when(foodUseCases.getCheese2(any(RestServiceApi.class))).thenReturn(cheese);
            Cheese result = foodUseCases.getCheese2(any(RestServiceApi.class));
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
            when(foodUseCases.getSweet1(any(RestServiceApi.class))).thenReturn(sweet);
            Sweet result = foodUseCases.getSweet1(any(RestServiceApi.class));
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
            when(foodUseCases.getSweet2(any(RestServiceApi.class))).thenReturn(sweet);
            Sweet result = foodUseCases.getSweet2(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cremes", sweet.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }
}