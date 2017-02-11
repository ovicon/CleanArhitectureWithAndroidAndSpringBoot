package ro.ovidiuconeac.backend.presentationlayer;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ovidiu on 2/10/17.
 */
@Controller
@EnableAutoConfiguration
public class FruitsControler {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FruitsControler.class, args);
    }

}
