#!/usr/bin/env bash
docker stop shopping-list-server && docker rm shopping-list-server

mvn clean install

docker build . -t shopping-list-api

docker run -d -p 8080:8080 --name shopping-list-server shopping-list-api