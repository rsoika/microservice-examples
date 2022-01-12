# microservice-examples
This is a collection of basic examples about how to implement a Microservice on different platforms. The examples can be used as templates for own projects on different environments:

**[Hello-World Example Jakarta EE 9](./jakarta9/README.md)**

A Microservice is build in JDK 11 and based on Jakarta EE 9 and Microprofile 3.2. The project runs with Docker on Payara or Wildfy. 

**[Hello-World Example Jakarta EE 8](./jakarta8/README.md)**

A Microservice is build in JDK 1.8 and based on Jakarta EE 8 and Microprofile 3.2. The project runs with Docker on Payara or Wildfy. 

**[Hello-World Example Spring Boot 2.6.2](./springboot/README.md)**

A Microservice is build in JDK 11 and based Spring Boot 2.6.2. The project can be started form Java Main class BaseApplication or with the SpringBoot uber jar. 


## The Rest API

All microservices provide a simple RestAPI with two services. 

 - The ping Service endpoint returns just a string
 - The data Service endpoint returns a java object in JSON and XML format. 

 