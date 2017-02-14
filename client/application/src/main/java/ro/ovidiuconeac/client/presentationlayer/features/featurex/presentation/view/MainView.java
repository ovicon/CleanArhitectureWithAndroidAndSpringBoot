package ro.ovidiuconeac.client.presentationlayer.features.featurex.presentation.view;

import ro.ovidiuconeac.client.presentationlayer.features.Screen;

/**
 * Created by ovidiu on 2/6/17.
 */

public interface MainView extends Screen {
    // Fruit 1
    void requestFruit1();
    void postFruit1(String fruit);
    void enableUiFruit1(boolean enable);
    void postFruit1RequestError();
    // Fruit 2
    void requestFruit2();
    void postFruit2(String fruit);
    void enableUiFruit2(boolean enable);
    void postFruit2RequestError();
    // Cheese 1
    void requestCheese1();
    void postCheese1(String cheese);
    void enableUiCheese1(boolean enable);
    void postCheese1RequestError();
    // Cheese 2
    void requestCheese2();
    void postCheese2(String cheese);
    void enableUiCheese2(boolean enable);
    void postCheese2RequestError();
    // Sweet 1
    void requestSweet1();
    void postSweet1(String sweet);
    void enableUiSweet1(boolean enable);
    void postSweet1RequestError();
    // Sweet 2
    void requestSweet2();
    void postSweet2(String sweet);
    void enableUiSweet2(boolean enable);
    void postSweet2RequestError();
}
