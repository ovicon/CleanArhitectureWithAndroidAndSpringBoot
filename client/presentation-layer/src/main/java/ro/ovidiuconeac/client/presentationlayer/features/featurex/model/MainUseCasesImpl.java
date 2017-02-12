package ro.ovidiuconeac.client.presentationlayer.features.featurex.model;

import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import ro.ovidiuconeac.client.businesslayer.beans.CheeseBean;
import ro.ovidiuconeac.client.businesslayer.beans.CheeseBeanImpl;
import ro.ovidiuconeac.client.businesslayer.beans.FruitsBean;
import ro.ovidiuconeac.client.businesslayer.beans.FruitsBeanImpl;
import ro.ovidiuconeac.client.businesslayer.beans.SweetsBean;
import ro.ovidiuconeac.client.businesslayer.beans.SweetsBeanImpl;
import ro.ovidiuconeac.client.models.Cheese;
import ro.ovidiuconeac.client.models.Fruit;
import ro.ovidiuconeac.client.models.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 */
public class MainUseCasesImpl {

    private Retrofit service;
    private MainUseCases useCases;

    public MainUseCasesImpl() {
        service = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        useCases = service.create(MainUseCases.class);
    }

    public Fruit getFruit1() {
        Fruit fruit = new Fruit("");
        Call<Fruit> call = useCases.fetchFruit();
        try {
            Response<Fruit> response = call.execute();
            fruit = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("OVI", "adsada sd ass " + fruit.getName());
        return fruit;
    }

    public Fruit getFruit2() {
        return null;
    }

    public Cheese getCheese1() {
        return null;
    }

    public Cheese getCheese2() {
        return null;
    }

    public Sweet getSweet1() {
        return null;
    }

    public Sweet getSweet2() {
        return null;
    }
}