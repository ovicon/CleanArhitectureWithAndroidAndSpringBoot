package ro.ovidiuconeac.server.features.featurex.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;

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
        Fruit fruit = new Fruit("Banana");
        Mockito.when(fruitsBean.getRandomFruit()).thenReturn(fruit);
        Fruit result = fruitsBean.getRandomFruit();
        assertNotNull(result);
        assertEquals("Banana", result.getName());
    }
}
