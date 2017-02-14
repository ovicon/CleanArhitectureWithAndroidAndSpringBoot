package ro.ovidiuconeac.server.features.featurex.presentation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ovidiuconeac.server.features.featurex.business.CheeseBeanImplTest;
import ro.ovidiuconeac.server.features.featurex.business.FruitsBeanImplTest;
import ro.ovidiuconeac.server.features.featurex.business.SweetsBeanImplTest;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FruitsControllerGetTest.class,
        CheesesControllerGetTest.class,
        SweetsControllerGetTest.class
})
public class ControllerGetTestSuite {
}
