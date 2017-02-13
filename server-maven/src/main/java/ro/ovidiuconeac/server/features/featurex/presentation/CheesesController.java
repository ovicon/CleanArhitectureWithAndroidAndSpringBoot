package ro.ovidiuconeac.server.features.featurex.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.server.features.featurex.business.CheeseBean;
import ro.ovidiuconeac.server.features.featurex.business.CheeseBeanImpl;
import ro.ovidiuconeac.server.features.featurex.models.Cheese;

import java.util.Random;

@RestController
public class CheesesController {

    @Autowired
    private CheeseBean cheeseBean;

    @RequestMapping("/cheese")
    public Cheese index() {
        return cheeseBean.getRandomCheese();
    }
}