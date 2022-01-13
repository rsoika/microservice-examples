# Hello World Example on SpringBoot

This is a basic Microservice example running on SpringBoot. It includes a Rest Service example.
The project runs with JDK 11.

## Build and Run

The project can be build with your IDE java compiler (JDK 11). To start the application run the java class


	com.ralph.BaseApplication
	

	
## The Rest API

The Microservice proivdes 2 simple Rest API endpoints:


	http://localhost:8080/api/ping

returns just a string with a timestamp


	http://localhost:8080/api/data/address/123

returns a Address Java Object. The object can be requested in JSON or XML
	


### Swagger	

The Microservice also includes a Swagger UI based on [springdoc](https://springdoc.org/).

	http://localhost:8080/swagger-ui/index.html
	

