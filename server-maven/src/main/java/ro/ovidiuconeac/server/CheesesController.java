package ro.ovidiuconeac.server;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CheesesController {

    @RequestMapping("/cheese")
    public String index() {
        return "cheese " + new Random().nextInt(10000);
    }
}