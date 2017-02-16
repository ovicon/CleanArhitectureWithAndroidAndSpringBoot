package ro.ovidiuconeac.client.features.food.presentation.model;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import ro.ovidiuconeac.client.features.food.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.food.exceptions.RequestException;
import ro.ovidiuconeac.client.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Feature X use cases.
 */
public class FoodUseCases {

    // Use case "get Fruit 1"
    public Fruit getFruit1(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchFruit(restServiceApi);
    }

    // Use case "get Fruit 2"
    public Fruit getFruit2(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchFruit(restServiceApi);
    }

    // Use case "get Cheese 1"
    public Cheese getCheese1(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchCheese(restServiceApi);
    }

    // Use case "get Cheese 2"
    public Cheese getCheese2(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchCheese(restServiceApi);
    }

    // Use case "get Sweet 1"
    public Sweet getSweet1(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchSweet(restServiceApi);
    }

    // Use case "get Sweet 2"
    public Sweet getSweet2(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        return fetchSweet(restServiceApi);
    }

    // Backend call to get a random Fruit
    private Fruit fetchFruit(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Fruit fruit = null;
        Call<Fruit> call = restServiceApi.fetchFruit();
        try {
            Response<Fruit> response = call.execute();
            switch (response.code()) {
                case 200: {
                    fruit = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return fruit;
    }

    // Backend call to get a random Cheese
    private Cheese fetchCheese(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Cheese cheese = null;
        Call<Cheese> call = restServiceApi.fetchCheese();
        try {
            Response<Cheese> response = call.execute();
            switch (response.code()) {
                case 200: {
                    cheese = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return cheese;
    }

    // Backend call to get a random Sweet
    private Sweet fetchSweet(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Sweet sweet = null;
        Call<Sweet> call = restServiceApi.fetchSweet();
        try {
            Response<Sweet> response = call.execute();
            switch (response.code()) {
                case 200: {
                    sweet = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return sweet;
    }
}