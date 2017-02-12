package ro.ovidiuconeac.server;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FruitsController {

    @RequestMapping("/fruit")
    public String index() {
        return "fruit " + new Random().nextInt(10000);
    }

}