package ro.ovidiuconeac.server.features.featurex.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.server.features.featurex.business.CheeseBean;

@RestController
public class CheesesController {

    @Autowired
    private CheeseBean cheeseBean;

    @RequestMapping("/featurex/cheese")
    public Cheese index() {
        return cheeseBean.getRandomCheese();
    }
}