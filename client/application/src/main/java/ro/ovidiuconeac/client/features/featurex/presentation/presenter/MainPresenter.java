package ro.ovidiuconeac.client.features.featurex.presentation.presenter;

import ro.ovidiuconeac.client.features.common.Presenter;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Main presenter interface.
 * Must implement {@link Presenter} to
 * support methods for presenter caching.
 */

public interface MainPresenter extends Presenter {
    void requestFruit1();
    void requestFruit2();
    void requestCheese1();
    void requestCheese2();
    void requestSweet1();
    void requestSweet2();
}
