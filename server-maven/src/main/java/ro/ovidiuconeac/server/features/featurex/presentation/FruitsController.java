package ro.ovidiuconeac.server.features.featurex.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.server.features.featurex.business.FruitsBean;

@RestController
public class FruitsController {

    @Autowired
    private FruitsBean fruitsBean;

    @RequestMapping("/featurex/fruit")
    public Fruit index() {
        return fruitsBean.getRandomFruit();
    }

}