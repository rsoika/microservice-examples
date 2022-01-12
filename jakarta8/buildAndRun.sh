#!/bin/sh
mvn clean package && docker build -t com.ralph.microprofile/micro-hello-world .
docker rm -f micro-hello-world || true && docker run -p 8080:8080 --name micro-hello-world com.ralph.microprofile/micro-hello-world 
