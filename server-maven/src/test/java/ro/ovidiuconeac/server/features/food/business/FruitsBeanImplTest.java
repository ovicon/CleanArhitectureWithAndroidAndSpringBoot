package ro.ovidiuconeac.server.features.food.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
public class FruitsBeanImplTest {

    private FruitsBean fruitsBean;

    @Before
    public void setUp() {
        fruitsBean = Mockito.mock(FruitsBeanImpl.class);
    }

    @After
    public void tearDown() {
        fruitsBean = null;
    }

    @Test
    public void testGetCheese() {
        try {
            Fruit fruit = new Fruit("Banana");
            Mockito.when(fruitsBean.getRandomFruit()).thenReturn(fruit);
            Fruit result = fruitsBean.getRandomFruit();
            assertNotNull(result);
            assertEquals("Banana", result.getName());
        } catch (NoResultException e) {
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheeseWithNoResultException1() {
        try {
            Mockito.when(fruitsBean.getRandomFruit()).thenThrow(new NoResultException());
            fruitsBean.getRandomFruit();
        } catch (NoResultException e) {
            assertEquals("No result found in database", e.getMessage());
        }
    }

    @Test(expected = NoResultException.class)
    public void testGetCheeseWithNoResultException2() throws NoResultException {
        Mockito.when(fruitsBean.getRandomFruit()).thenThrow(new NoResultException());
        fruitsBean.getRandomFruit();
    }
}
