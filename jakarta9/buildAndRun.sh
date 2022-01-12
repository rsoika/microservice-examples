#!/bin/sh
mvn clean package && docker build -t com.ralph.microprofile/hello-world .
docker rm -f hello-world || true && docker run -p 8080:8080 --name hello-world com.ralph.microprofile/hello-world 
