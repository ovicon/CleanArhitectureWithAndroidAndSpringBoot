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
The client application executes some GET requests on the web server to get cheeses, fruits and sweets objects. It then processes these objects to properly display the names of cheeses, fruits and sweets on the user interface.

Each GET request on the same endpoint, returns a random object of the type specified for that endpoint.

The proposed solution contains the following 5-tier clean architecture, considering both client and server as a whole:  the presentation layer, the API layer, the business layer, the data layer, and the database layer.
![5 tier clean architecture](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_architecture_layers_5_tier.png "5 tier clean architecture")
The presentation layer represents the Android client application. This layer is implemented using an MVP (model view presenter) design, also supporting asynchronous operations.

The API layer represents the web server REST endpoints. The API through which the client application and the server application communicate.

The business layer is the domain specific code, and is implemented as plain Java objects.

The data layer is an abstraction layer for the database. Its purpose is to expose implemented database operations.

The database layer represents the actual database. This is a in-memory H2 Java SQL database.

The vertical yellow line represents the boundary between the client and the server, while the vertical green lines represent boundaries between layers that belong to the web server application. These vertical lines represent the separation of concerns, archived by dividing the software into layers.

The arrow shows the code dependency rule, starting from the lowest layer, the presentation layer, going through each layer, until the highest layer, the database layer. Each layer knows about its immediate higher layer, and no layers know about their immediate lower layers. The code dependency rule is a one way street.

The simplified development process
-------
First we define the requirements of the solution, and separate them in two groups, functional and non-functional requirements. Functional requirements describe what the system should does, while non-functional requirements describe how the system works.
___

