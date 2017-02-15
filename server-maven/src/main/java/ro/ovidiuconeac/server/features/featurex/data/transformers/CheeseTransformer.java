package ro.ovidiuconeac.server.features.featurex.data.transformers;

import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.featurex.data.entities.CheeseEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
public class CheeseTransformer {

    public Cheese getModelFrom(CheeseEntity cheeseEntity) {
        return new Cheese(cheeseEntity.getName());
    }
}
