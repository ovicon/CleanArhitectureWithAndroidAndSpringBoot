package ro.ovidiuconeac.client.presentationlayer.features.featurex.model;

import ro.ovidiuconeac.client.businesslayer.beans.CheeseBean;
import ro.ovidiuconeac.client.businesslayer.beans.CheeseBeanImpl;
import ro.ovidiuconeac.client.businesslayer.beans.FruitsBean;
import ro.ovidiuconeac.client.businesslayer.beans.FruitsBeanImpl;
import ro.ovidiuconeac.client.businesslayer.beans.SweetsBean;
import ro.ovidiuconeac.client.businesslayer.beans.SweetsBeanImpl;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 */
@Deprecated
public class MainUseCasesDummy {

    private FruitsBean fruitBean;
    private CheeseBean cheeseBean;
    private SweetsBean sweetsBean;

    public MainUseCasesDummy() {
        this.fruitBean = new FruitsBeanImpl();
        this.cheeseBean = new CheeseBeanImpl();
        this.sweetsBean = new SweetsBeanImpl();
    }

    public Fruit getFruit1() {
        return fruitBean.getRandomFruit();
    }

    public Fruit getFruit2() {
        return fruitBean.getRandomFruit();
    }

    public Cheese getCheese1() {
        return cheeseBean.getRandomCheese();
    }

    public Cheese getCheese2() {
        return cheeseBean.getRandomCheese();
    }

    public Sweet getSweet1() {
        return sweetsBean.getRandomSweet();
    }

    public Sweet getSweet2() {
        return sweetsBean.getRandomSweet();
    }
}
