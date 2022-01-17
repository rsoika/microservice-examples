# Hello World Example on Jakarta EE 9

This is a basic Microservice example running on Jakarta 9. It includes a Rest Service example and also a Health Service.
The project runs with JDK 11. In a Jakarta EE 9 application the new namespace `jakarta.*` is used.


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


	http://localhost:8080/api/data/address/123

returns a Address Java Object. The object can be requested in JSON or XML
	

### Swagger	

The Microservice also includes a Swagger UI.

	http://localhost:8080/api/openapi-ui/
	
	
	
	
## Health 

Based on Jakarta EE 9 and Microprofile 3 the Microservice also provides an example Healthcheck endpoint:

	http://localhost:8080/health

or 

	http://localhost:9990/health
	
	
# Maven Archetype

You can also generate a Maven Archetype out from this project to be used to create custom projects:


	$ mvn archetype:create-from-project

This will generate a new archetype from the current project.
Next navigate to target\generated-sources\archetype and run:

	$ mvn install archetype:update-local-catalog

	
Now the new archetype is installed locally. You can create a new project now with:

	$ cd my-project-folder	
	$ mvn archetype:generate -DarchetypeCatalog=local

Choose the number of your generated project.

Or run:

	$  mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=com.rsoika  -DarchetypeArtifactId=hello-world-jakarta9-archetype


	