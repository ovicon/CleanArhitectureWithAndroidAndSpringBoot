package ro.ovidiuconeac.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.ovidiuconeac.server.features.featurex.business.*;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public FruitsBean fruitsBean() {
//        return new FruitsBeanImpl();
//    }
//
//    @Bean
//    public CheeseBean cheeseBean() {
//        return new CheeseBeanImpl();
//    }
//
//    @Bean
//    public SweetsBean sweetsBean() {
//        return new SweetsBeanImpl();
//    }
}
