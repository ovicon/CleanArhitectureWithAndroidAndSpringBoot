package ro.ovidiuconeac.client.features.food.presentation.presenter;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

import java.util.UUID;

import ro.ovidiuconeac.client.features.common.Screen;
import ro.ovidiuconeac.client.features.common.Util;
import ro.ovidiuconeac.client.features.food.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.food.exceptions.RequestException;
import ro.ovidiuconeac.client.features.food.presentation.model.FoodUseCases;
import ro.ovidiuconeac.client.features.food.presentation.view.FoodView;
import ro.ovidiuconeac.client.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Implementation for the main presenter.
 * Must implement {@link FoodPresenter}
 */

public class FoodPresenterImpl implements FoodPresenter {

    private UUID uuid;
    private FoodView view;
    private FoodUseCases model;

    public FoodPresenterImpl(FoodView view) {
        this.uuid = UUID.randomUUID();
        this.view = view;
        this.model = new FoodUseCases();
    }

    @Override
    public void requestFruit1(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Fruit>() {

            @Override
            protected Fruit doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Fruit fruit = new Fruit("");
                try {
                    fruit = model.getFruit1(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postFruit1RequestError();
                        }
                    });
                }
                return fruit;
            }

            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit1(fruit.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestFruit2(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Fruit>() {

            @Override
            protected Fruit doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Fruit fruit = new Fruit("");
                try {
                    fruit = model.getFruit2(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postFruit2RequestError();
                        }
                    });
                }
                return fruit;
            }

            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit2(fruit.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestCheese1(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Cheese>() {

            @Override
            protected Cheese doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Cheese cheese = new Cheese("");
                try {
                    cheese = model.getCheese1(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postCheese1RequestError();
                        }
                    });
                }
                return cheese;
            }

            @Override
            protected void onPostExecute(Cheese cheese) {
                super.onPostExecute(cheese);
                view.postCheese1(cheese.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestCheese2(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Cheese>() {

            @Override
            protected Cheese doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Cheese cheese = new Cheese("");
                try {
                    cheese = model.getCheese2(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postCheese2RequestError();
                        }
                    });
                }
                return cheese;
            }

            @Override
            protected void onPostExecute(Cheese cheese) {
                super.onPostExecute(cheese);
                view.postCheese2(cheese.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestSweet1(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Sweet>() {

            @Override
            protected Sweet doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Sweet sweet = new Sweet("");
                try {
                    sweet = model.getSweet1(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postSweet1RequestError();
                        }
                    });
                }
                return sweet;
            }

            @Override
            protected void onPostExecute(Sweet sweet) {
                super.onPostExecute(sweet);
                view.postSweet1(sweet.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestSweet2(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Sweet>() {

            @Override
            protected Sweet doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Sweet sweet = new Sweet("");
                try {
                    sweet = model.getSweet2(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            view.postSweet2RequestError();
                        }
                    });
                }
                return sweet;
            }

            @Override
            protected void onPostExecute(Sweet sweet) {
                super.onPostExecute(sweet);
                view.postSweet2(sweet.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void setScreen(Screen screen) {
        this.view = (FoodView) screen;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
}