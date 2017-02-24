package ro.ovidiuconeac.server.features.food.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FoodControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getCheese() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/cheese")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getFruit() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/fruit")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getSweet() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/food/sweet")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}