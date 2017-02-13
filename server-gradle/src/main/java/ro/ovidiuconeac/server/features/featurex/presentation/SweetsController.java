package ro.ovidiuconeac.server.features.featurex.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.server.features.featurex.business.SweetsBean;
import ro.ovidiuconeac.server.features.featurex.models.Sweet;

@RestController
public class SweetsController {

    @Autowired
    private SweetsBean sweetsBean;

    @RequestMapping("/sweet")
    public Sweet get() {
        return sweetsBean.getRandomSweet();
    }
}