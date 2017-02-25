package ro.ovidiuconeac.server.features.food.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.data.dao.SweetsDao;
import ro.ovidiuconeac.server.features.food.data.exceptions.SweetNotFoundException;
import ro.ovidiuconeac.server.features.food.data.transformers.FruitTransformer;
import ro.ovidiuconeac.server.features.food.data.transformers.SweetTransformer;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class SweetsBeanImpl implements SweetsBean {

    private final SweetsDao dao;
    private SweetTransformer transformer;

    // Better for testing
    @Autowired
    public SweetsBeanImpl(SweetsDao dao) {
        this.dao = dao;
        this.transformer = new SweetTransformer();
    }

    @Override
    public Sweet getRandomSweet() throws NoResultException {
        Sweet sweet;
        try {
            sweet = transformer.getModelFrom(dao.getRandomSweet());
        } catch (SweetNotFoundException e) {
            throw new NoResultException();
        }
        return sweet;
    }
}
