#!/usr/bin/env bash
gradle build
docker build -t tendril/my-home-api-bootstrap .
docker run -d -p 8080:8080 --env-file ./env.dev tendril/my-home-api-bootstrap