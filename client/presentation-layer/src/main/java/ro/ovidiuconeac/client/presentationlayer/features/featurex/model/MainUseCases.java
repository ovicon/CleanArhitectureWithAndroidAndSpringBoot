package ro.ovidiuconeac.client.presentationlayer.features.featurex.model;

import retrofit2.Call;
import retrofit2.http.GET;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;
import ro.ovidiuconeac.client.presentationlayer.features.Screen;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

public interface MainUseCases {

    @GET("fruit")
    Call<Fruit> fetchFruit();

    @GET("cheese")
    Call<Cheese> fetchCheese();

    @GET("sweet")
    Call<Sweet> fetchSweet();
}
