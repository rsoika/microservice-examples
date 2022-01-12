# Hello World Example on Jakarta EE 9

This is a basic Microservice example running on Jakarta 9. It includes a Rest Service example and also a Health Service.
The project runs with JDK 11.

## Build

The project is based on Docker. To build the project you can run:

	$./buildAndRun.sh

This will run a Maven build, creating a new Docker image and starting the server

To manually build and run you can run the following commands:


	$ mvn clean package && docker build -t com.ralph.microprofile/hello-world .
	$ docker run -d -p 8080:8080 --name hello-world com.ralph.microprofile/hello-world 
	


	
## The Rest API

The Microservice proivdes 2 simple Rest API endpoints:


	http://localhost:8080/api/ping

returns just a string with a timestamp


	http://localhost:8080/api/data/address

returns a Address Java Object. The object can be requested in JSON or XML
	

### Swagger	

The Microservice also includes a Swagger UI.

	http://localhost:8080/api/openapi-ui/
	
	
	
	
## Health 

Based on Jakarta EE 9 and Microprofile 3 the Microservice also provides an example Healthcheck endpoint:

	http://localhost:8080/health
	
	
