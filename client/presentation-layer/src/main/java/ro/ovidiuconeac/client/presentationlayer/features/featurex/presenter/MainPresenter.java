package ro.ovidiuconeac.client.presentationlayer.features.featurex.presenter;

import ro.ovidiuconeac.client.presentationlayer.features.Presenter;

/**
 * Created by ovidiu on 2/6/17.
 */

public interface MainPresenter extends Presenter {
    void requestFruit1();
    void requestFruit2();
    void requestCheese1();
    void requestCheese2();
    void requestSweet1();
    void requestSweet2();
    void showRequestError();
}
