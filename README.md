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
The functional requirements state that a client server solution is required.

The client application gets random fruits, cheeses and sweets from a server application, and displays the name of each fruit, cheese and sweet on the client user interface.

The application can display 2 fruits, 2 cheeses and 2 sweets at the same time.

The client application must be able to configure via the user interface the schema, host and port, for the server connection.

The server must expose 4 REST endpoints that represents its API.

An endpoint for fruit, one for cheese, one for sweet and one for server connection.

Each consecutive request of the same endpoint returns a random object of the same type.

A web application must display the schema, host and port of the web server.

The wireframes for the client application and the web application.

This is a small sample of functional requirements.
___
The non-functional requirements state that the client must be an Android application, while the server must be a Spring Boot application.

The system must be decoupled, testable, maintainable.

The client application must handle orientation change.

The client application must be asynchronous.

The web application and the web server represent the server application.

The port must be configured via a configuration file at build time.

The server application must an in-memory database. e.g. H2.

The database will automatically be populated when the application is started.

This is a small sample of non-functional requirements.
___
The architecture of the system is very simple. I shall succinctly explain it with the C4 software architectural model. The "C4 model" is a simple hierarchical way to think about the static structures of a software system in terms of containers, components and classes (or code). The details about this software architectural model are not the topic of this discussion.

At the first level, called the context, we have the system and its interactions with other software systems. In our case, the system represented by the client application and the web application, is isolated from any external dependencies and represents one entity.

At the second level we have the containers. These are represented by the client application and that server application.

At the third level we have the components of each container. These represent the design of the code.

At the forth level we have the classes. Therese are the implementation.
___
The mock-ups come next and are based on the wireframes and requirements. For the sake of simplicity I am just going to show the actual implementation as mock-ups:
The client application mock-up:
![Client mock-up](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/client_mockup.png "Client mock-up")
The web application mock-up:
![Web application mock-up](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/web_app_mockup.png "Web application mock-up")
___
Next comes the design of the application. This is the implementation phase, the writing of the code, based on clearly define code structures. We can include here, MVP, package by feature, name and location of packages, design patterns, clean code, common code style, etc.

Remember architecture is what the system does, while design is how the applications does it. Architecture is more abstract, while design is concrete.

The design of the client application, the presentation layer in our the context, is based on MVP (model view presenter) design.

Each feature is an abstraction for a set of common use cases, and each feature is implemented as MVP.

The client application has only one feature, food:

![5-tier presentation layer features](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/presentation-layer_5_tier.png "5-tier presentation layer features")

These feature implements the following uses cases:

![5 tier presentation-layer use cases](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/presentation-layer_5_tier_use_cases.png "5 tier presentation-layer use cases")
```java
package ro.ovidiuconeac.client.features.food.presentation.model;
...
public class FoodUseCases {

    // Use case "get Fruit 1"
    public Fruit getFruit1(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}

    // Use case "get Fruit 2"
    public Fruit getFruit2(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}

    // Use case "get Cheese 1"
    public Cheese getCheese1(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}

    // Use case "get Cheese 2"
    public Cheese getCheese2(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}

    // Use case "get Sweet 1"
    public Sweet getSweet1(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}

    // Use case "get Sweet 2"
    public Sweet getSweet2(RestServiceApi restServiceApi) 
       throws RequestException, NoResultException {...}
...
}
```
These use cases, or model, or interactor, or whatever you want to call it, represent application specific business rules. They are specific to the application and not the domain. They orchestrate the flow of data between the presentation layer, represented by the client application, and the API layer, represented by the server application. You can think of them, as what the application does, what the presentation layer does, what does a feature do.

If you want to see more about MVP in Android see: Asynchronous MVP Design for Android, without 3rd Party Libraries and Clean Architecture in Android with MVP Presentation Layer.



Next we design the server application as a 4-tier clean architecture. No higher level of design, like MVP, is used here. The design concepts used are features and use cases. Each feature is packaged by layer.

The server application has two features:

![Web server application features](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/web_server_application_features.png "Web server application features")
Both features are implemented by layer, API, business, data:

![Web server application features by layer](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/web_server_application_features_by_layer.png "Web server application features by layer")
The serverconnection feature does not implement the data layer because it has no need to communicate with a database.

The unit tests are part of the design. In test driven development they actually help create the design. In our system they just make sure that the design functions correctly.

So designing, unit testing and implementation go hand in hand.
___
Next comes the testing part, this means to test the functional requirements of the final product

Running the examples
-------
To run the examples you need Android Studio for the client application, and IntelliJ for the server part.

The workflow is as follows: start the server application, open a browser window, go to http://localhost:1984 and see the server connection, start the client in an emulator, enter the server connection in the client, run the client uses cases.

For the best results, use a laptop for the server application, and an actual Android device for the client application. Both the laptop and the Android device must be connected to the same Wi-Fi connection. 

Known issues
-------
While working with a laptop and an Android device, to develop and test the system, I had absolutely no issues in client server communication.

However, while working on my desktop PC together with an Android emulator, I did encounter some unexpected behavior. The client application would not connect to the displayed server connection. The issue had something to do with loopbacks.

To fix this, I test if the local host provided by by the serverconnection feature is a loopback address. If it is, then the server connection is the android emulator loopback together with the port, http://10.0.2.2:1984.
```java
package ro.ovidiuconeac.server.features.serverconnection.business
...
@Service
public class ServerConnectionBeanImpl implements ServerConnectionBean {
    ...
    @Override
    public ServerConnection getServerConnection() {
        ...
            if (InetAddress.getLocalHost().isLoopbackAddress()) {
                // If you use a desktop PC with a cable connection
                host = "10.0.2.2";
            } else {
                ip = InetAddress.getLocalHost();
                host = ip.getHostAddress();
            }
        ...           
    }
}
```
Conclusion
-------
Architecture and design are not easy, and they are essential to software engineering and quality software.

The system used as an example, represents an opinionated view on how to do clean architecture. This view is still work in progress, as I dig ever further in the confusing and wonderful world of software engineering.

Therefore I do encourage further reading on the topic, take everything with a grain of salt, here all the perspectives, understand for yourself, and apply whatever works for you.
