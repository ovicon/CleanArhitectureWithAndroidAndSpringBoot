package ro.ovidiuconeac.server.features.food.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
public class SweetsBeanImplTest {

    private SweetsBean sweetsBean;

    @Before
    public void setUp() {
        sweetsBean = Mockito.mock(SweetsBeanImpl.class);
    }

    @After
    public void tearDown() {
        sweetsBean = null;
    }

    @Test
    public void testGetCheese() {
        try {
            Sweet sweet = new Sweet("Amandina");
            Mockito.when(sweetsBean.getRandomSweet()).thenReturn(sweet);
            Sweet result = sweetsBean.getRandomSweet();
            assertNotNull(result);
            assertEquals("Amandina", result.getName());
        } catch (NoResultException e) {
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheeseWithNoResultException1() {
        try {
            Mockito.when(sweetsBean.getRandomSweet()).thenThrow(new NoResultException());
            sweetsBean.getRandomSweet();
        } catch (NoResultException e) {
            assertEquals("No result found in database", e.getMessage());
        }
    }

    @Test(expected = NoResultException.class)
    public void testGetCheeseWithNoResultException2() throws NoResultException {
        Mockito.when(sweetsBean.getRandomSweet()).thenThrow(new NoResultException());
        sweetsBean.getRandomSweet();
    }
}
