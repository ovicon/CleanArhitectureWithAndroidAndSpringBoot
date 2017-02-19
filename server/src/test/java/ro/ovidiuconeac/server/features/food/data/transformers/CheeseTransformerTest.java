package ro.ovidiuconeac.server.features.food.data.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.server.features.food.data.entities.CheeseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class CheeseTransformerTest {

    private CheeseTransformer cheeseTransformer;
    private CheeseEntity entity;

    @Before
    public void setUp() {
        cheeseTransformer = new CheeseTransformer();
        entity = new CheeseEntity();
        entity.setId(1L);
        entity.setName("Cas");
    }

    @After
    public void tearDown() {
        cheeseTransformer = null;
    }

    @Test
    public void testCheeseTransformer() {
        Cheese cheese = cheeseTransformer.getModelFrom(entity);
        assertNotNull(cheese);
        assertEquals("Cas", cheese.getName());
    }
}
