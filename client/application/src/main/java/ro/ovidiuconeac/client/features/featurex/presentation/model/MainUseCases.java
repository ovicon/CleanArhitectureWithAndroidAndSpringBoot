package ro.ovidiuconeac.client.features.featurex.presentation.model;

import java.io.IOException;

import retrofit2.Call;
import ro.ovidiuconeac.client.features.featurex.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Feature X use cases.
 */
public class MainUseCases {

    // Use case "get Fruit 1"
    public Fruit getFruit1(RestServiceApi restServiceApi) throws RequestException {
        return fetchFruit(restServiceApi);
    }

    // Use case "get Fruit 2"
    public Fruit getFruit2(RestServiceApi restServiceApi) throws RequestException {
        return fetchFruit(restServiceApi);
    }

    // Use case "get Cheese 1"
    public Cheese getCheese1(RestServiceApi restServiceApi) throws RequestException {
        return fetchCheese(restServiceApi);
    }

    // Use case "get Cheese 2"
    public Cheese getCheese2(RestServiceApi restServiceApi) throws RequestException {
        return fetchCheese(restServiceApi);
    }

    // Use case "get Sweet 1"
    public Sweet getSweet1(RestServiceApi restServiceApi) throws RequestException {
        return fetchSweet(restServiceApi);
    }

    // Use case "get Sweet 2"
    public Sweet getSweet2(RestServiceApi restServiceApi) throws RequestException {
        return fetchSweet(restServiceApi);
    }

    // Backend call to get a random Fruit
    private Fruit fetchFruit(RestServiceApi restServiceApi) throws RequestException{
        Call<Fruit> call = restServiceApi.fetchFruit();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Backend call to get a random Cheese
    private Cheese fetchCheese(RestServiceApi restServiceApi) throws RequestException {
        Call<Cheese> call = restServiceApi.fetchCheese();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Backend call to get a random Sweet
    private Sweet fetchSweet(RestServiceApi restServiceApi) throws RequestException {
        Call<Sweet> call = restServiceApi.fetchSweet();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }
}