package ro.ovidiuconeac.server.features.food.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.business.CheeseBean;
import ro.ovidiuconeac.server.features.food.business.FruitsBean;
import ro.ovidiuconeac.server.features.food.business.SweetsBean;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

@RestController
public class FoodController {

    @Autowired
    private FruitsBean fruitsBean;

    @Autowired
    private CheeseBean cheeseBean;

    @Autowired
    private SweetsBean sweetsBean;

    @RequestMapping("/food/fruit")
    public Fruit getRandomFruit() throws NoResultException {
        return fruitsBean.getRandomFruit();
    }

    @RequestMapping("/food/cheese")
    public Cheese getRandomCheese() throws NoResultException {
        return cheeseBean.getRandomCheese();
    }

    @RequestMapping("/food/sweet")
    public Sweet getRandomSweet() throws NoResultException {
        return sweetsBean.getRandomSweet();
    }
}