package ro.ovidiuconeac.client.features.featurex.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 *
 * Backend REST calls, used by Retrofit to
 * create the communication interface with
 * the server.
 */

public interface RestServiceApi {

    @GET("featurex/fruit")
    Call<Fruit> fetchFruit();

    @GET("featurex/cheese")
    Call<Cheese> fetchCheese();

    @GET("featurex/sweet")
    Call<Sweet> fetchSweet();
}
