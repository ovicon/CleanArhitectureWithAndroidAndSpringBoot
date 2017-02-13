package ro.ovidiuconeac.server.features.featurex.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.server.features.featurex.business.FruitsBean;
import ro.ovidiuconeac.server.features.featurex.models.Fruit;

@RestController
public class FruitsController {

    @Autowired
    private FruitsBean fruitsBean;

    @RequestMapping("/fruit")
    public Fruit index() {
        return fruitsBean.getRandomFruit();
    }

}