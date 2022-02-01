#!/bin/sh
mvn clean package && docker build -t com.ralph.microprofile/hello-world .
docker-compose up