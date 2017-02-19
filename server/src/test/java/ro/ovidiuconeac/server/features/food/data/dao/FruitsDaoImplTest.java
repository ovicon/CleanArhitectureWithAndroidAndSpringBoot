package ro.ovidiuconeac.server.features.food.data.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.data.exceptions.FruitNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/19/17.
 */
public class FruitsDaoImplTest {

    private FruitsDao fruitsDao;

    @Before
    public void setUp() {
        fruitsDao = mock(FruitsDao.class);
    }

    @After
    public void tearDown() {
        fruitsDao = null;
    }

    @Test
    public void getRandomCheese() {
        Fruit fruit = new Fruit("Apple");
        Fruit result = null;
        try {
            when(fruitsDao.getRandomFruit()).thenReturn(fruit);
            result = fruitsDao.getRandomFruit();
        } catch (FruitNotFoundException e) {
            assertEquals(true, false);
        }
        assertNotNull(result);
        assertEquals(fruit.getName(), result.getName());
    }

    @Test
    public void getRandomFruitWithFruitNotFoundException1() {
        try {
            when(fruitsDao.getRandomFruit()).thenThrow(new FruitNotFoundException());
            fruitsDao.getRandomFruit();
        } catch (FruitNotFoundException e) {
            assertEquals("No fruits found in database", e.getMessage());
        }
    }

    @Test(expected = FruitNotFoundException.class)
    public void getRandomFruitWithFruitNotFoundException2() throws FruitNotFoundException {
        when(fruitsDao.getRandomFruit()).thenThrow(new FruitNotFoundException());
        fruitsDao.getRandomFruit();
    }
}
