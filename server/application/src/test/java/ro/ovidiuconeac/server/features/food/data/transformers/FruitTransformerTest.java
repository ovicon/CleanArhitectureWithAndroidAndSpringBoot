package ro.ovidiuconeac.server.features.food.data.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.server.features.food.data.entities.FruitEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class FruitTransformerTest {

    private FruitTransformer fruitTransformer;
    private FruitEntity entity;

    @Before
    public void setUp() {
        fruitTransformer = new FruitTransformer();
        entity = new FruitEntity();
        entity.setName("Cherry");
        entity.setId(1L);
    }

    @After
    public void tearDown() {
        fruitTransformer = null;
    }

    @Test
    public void testFruitTransformer() {
        Fruit fruit = fruitTransformer.getModelFrom(entity);
        assertNotNull(fruit);
        assertEquals("Cherry", fruit.getName());
    }
}
