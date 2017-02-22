# CleanArhitectureWIthAndroidAndSpringBoot
Full stack implementation, based on clean architecture, with Android client and Spring Boot backend. 

The problem
-------
How to use the concept of clean architecture to implement a full stack solution, consisting of an Android client application, and a Spring Boot RESTful web service.

As a gentle introduction, clean architecture is: separation of concerns achieved by dividing the software into layers, independence of frameworks, testable, independence of user interface, independence of databases, with a code dependency rule that can point only inwards, from the lower layers, like the presentation, to the higher layers, like the database.

The solution
-------
The proposed solution consists of an client application implemented as an Android application, and a RESTful web service implemented as a Spring Boot application, that communicate via a REST API.

The web service exposes the following REST endpoints:
```java
food/fruit - GET a random fruit object

food/cheese - GET a random cheese object

food/sweet - GET a random sweet object

serverconnection - GET a server connection object
```
The client uses the following interface to communicate with the server:
```java
package ro.ovidiuconeac.client.features.food.rest;

public interface RestServiceApi {

    @GET("food/fruit")
    Call<Fruit> fetchFruit();

    @GET("food/cheese")
    Call<Cheese> fetchCheese();

    @GET("food/sweet")
    Call<Sweet> fetchSweet();
}
```

TODO
