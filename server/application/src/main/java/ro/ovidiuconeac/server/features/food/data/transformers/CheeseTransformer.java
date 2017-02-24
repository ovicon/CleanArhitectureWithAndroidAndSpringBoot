package ro.ovidiuconeac.server.features.food.data.transformers;

import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.server.features.food.data.entities.CheeseEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
public class CheeseTransformer {

    public Cheese getModelFrom(CheeseEntity cheeseEntity) {
        return new Cheese(cheeseEntity.getName());
    }
}
