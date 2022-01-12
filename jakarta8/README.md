# Build


	$ mvn clean package && docker build -t com.ralph.microprofile/hello-world .

# RUN

	$ docker run -d -p 8080:8080 --name hello-world com.ralph.microprofile/hello-world 
	

	
	
# Health 

Healthcheck:

	http://localhost:8080/health
	
# Rest API

get ping

	http://localhost:8080/api/ping
	http://localhost:8080/api/address
	

Swagger	
	http://localhost:8080/api/openapi-ui/