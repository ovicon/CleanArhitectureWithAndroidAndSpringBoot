package ro.ovidiuconeac.server.features.featurex.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ro.ovidiuconeac.models.features.featurex.Cheese;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
public class CheeseBeanImplTest {

    private CheeseBean cheeseBean;

    @Before
    public void setUp() {
        cheeseBean = Mockito.mock(CheeseBeanImpl.class);
    }

    @After
    public void tearDown() {
        cheeseBean = null;
    }

    @Test
    public void testGetCheese() {
        Cheese cheese = new Cheese("Telemea");
        Mockito.when(cheeseBean.getRandomCheese()).thenReturn(cheese);
        Cheese result = cheeseBean.getRandomCheese();
        assertNotNull(result);
        assertEquals("Telemea", result.getName());
    }
}
