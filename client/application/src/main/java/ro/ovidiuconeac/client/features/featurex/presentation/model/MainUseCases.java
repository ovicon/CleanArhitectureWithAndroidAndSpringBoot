package ro.ovidiuconeac.client.features.featurex.presentation.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;
import ro.ovidiuconeac.client.features.common.Configuration;
import ro.ovidiuconeac.client.features.featurex.exceptions.RequestException;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Feature X use cases.
 */
public class MainUseCases {

    private MainRestCalls useCases;

    public MainUseCases() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl(Configuration.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        useCases = service.create(MainRestCalls.class);
    }

    // Use case "get Fruit 1"
    public Fruit getFruit1() throws RequestException {
        return fetchFruit();
    }

    // Use case "get Fruit 2"
    public Fruit getFruit2() throws RequestException {
        return fetchFruit();
    }

    // Use case "get Cheese 1"
    public Cheese getCheese1() throws RequestException {
        return fetchCheese();
    }

    // Use case "get Cheese 2"
    public Cheese getCheese2() throws RequestException {
        return fetchCheese();
    }

    // Use case "get Sweet 1"
    public Sweet getSweet1() throws RequestException {
        return fetchSweet();
    }

    // Use case "get Sweet 2"
    public Sweet getSweet2() throws RequestException {
        return fetchSweet();
    }

    // Backend call to get a random Fruit
    private Fruit fetchFruit() throws RequestException{
        Call<Fruit> call = useCases.fetchFruit();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Backend call to get a random Cheese
    private Cheese fetchCheese() throws RequestException {
        Call<Cheese> call = useCases.fetchCheese();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Backend call to get a random Sweet
    private Sweet fetchSweet() throws RequestException {
        Call<Sweet> call = useCases.fetchSweet();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }
}