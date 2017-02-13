package ro.ovidiuconeac.client.presentationlayer.features.featurex.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;
import ro.ovidiuconeac.client.presentationlayer.features.featurex.presenter.MainPresenter;

/**
 * Created by ovidiu on 2/6/17.
 */
public class MainUseCasesImpl {

    private Retrofit service;
    private MainUseCases useCases;
    private Fruit fruit1;
    private MainPresenter presenter;

    public MainUseCasesImpl(MainPresenter presenter) {
        this.presenter = presenter;
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        service = new Retrofit.Builder()
                .baseUrl("http://192.168.0.122:8080")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        useCases = service.create(MainUseCases.class);
    }

    public Fruit getFruit1() {
        Fruit fruit = new Fruit("");
        Call<Fruit> call = useCases.fetchFruit();
        try {
            fruit = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return fruit;
    }

    public Fruit getFruit2() {
        Fruit fruit = new Fruit("");
        Call<Fruit> call = useCases.fetchFruit();
        try {
            fruit = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return fruit;
    }

    public Cheese getCheese1() {
        Cheese cheese = new Cheese("");
        Call<Cheese> call = useCases.fetchCheese();
        try {
            cheese = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return cheese;
    }

    public Cheese getCheese2() {
        Cheese cheese = new Cheese("");
        Call<Cheese> call = useCases.fetchCheese();
        try {
            cheese = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return cheese;
    }

    public Sweet getSweet1() {
        Sweet sweet = new Sweet("");
        Call<Sweet> call = useCases.fetchSweet();
        try {
            sweet = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return sweet;
    }

    public Sweet getSweet2() {
        Sweet sweet = new Sweet("");
        Call<Sweet> call = useCases.fetchSweet();
        try {
            sweet = call.execute().body();
        } catch (IOException e) {
            // TODO give more information
            presenter.showRequestError();
        }
        return sweet;
    }
}