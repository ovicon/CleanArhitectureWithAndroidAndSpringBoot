package ro.ovidiuconeac.server.features.food.data.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.featurex.Fruit;
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
        entity.setId(1L);
        entity.setName("Cherry");
    }

    @After
    public void tearDown() {
        fruitTransformer = null;
    }

    @Test
    public void testFruitTransformer() {
        Fruit Fruit = fruitTransformer.getModelFrom(entity);
        assertNotNull(Fruit);
        assertEquals("Cherry", Fruit.getName());
    }
}
