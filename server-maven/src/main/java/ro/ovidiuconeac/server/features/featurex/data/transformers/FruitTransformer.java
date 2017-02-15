package ro.ovidiuconeac.server.features.featurex.data.transformers;

import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.featurex.data.entities.FruitEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
public class FruitTransformer {

    public Fruit getModelFrom(FruitEntity fruitEntity) {
        return new Fruit(fruitEntity.getName());
    }
}
