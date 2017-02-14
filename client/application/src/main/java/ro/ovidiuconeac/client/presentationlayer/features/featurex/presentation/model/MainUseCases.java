package ro.ovidiuconeac.client.presentationlayer.features.featurex.presentation.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;
import ro.ovidiuconeac.client.presentationlayer.features.featurex.exceptions.RequestException;

/**
 * Created by ovidiu on 2/6/17.
 */
public class MainUseCases {

    private Retrofit service;
    private MainRestCalls useCases;

    public MainUseCases() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        service = new Retrofit.Builder()
                .baseUrl("http://192.168.0.122:8080")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        useCases = service.create(MainRestCalls.class);
    }

    public Fruit getFruit1() throws RequestException {
        return fetchFruit();
    }

    public Fruit getFruit2() throws RequestException {
        return fetchFruit();
    }

    public Cheese getCheese1() throws RequestException {
        return fetchCheese();
    }

    public Cheese getCheese2() throws RequestException {
        return fetchCheese();
    }

    public Sweet getSweet1() throws RequestException {
        return fetchSweet();
    }

    public Sweet getSweet2() throws RequestException {
        return fetchSweet();
    }

    private Fruit fetchFruit() throws RequestException{
        Call<Fruit> call = useCases.fetchFruit();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    private Cheese fetchCheese() throws RequestException {
        Call<Cheese> call = useCases.fetchCheese();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    private Sweet fetchSweet() throws RequestException {
        Call<Sweet> call = useCases.fetchSweet();
        try {
            return call.execute().body();
        } catch (IOException e) {
            throw new RequestException();
        }
    }
}