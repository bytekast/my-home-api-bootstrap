FROM java:8

# Install maven
RUN apt-get update
RUN apt-get install curl

WORKDIR /app

# Prepare
ADD ./build/libs/my-home-api-bootstrap-0.1.0.jar /app/my-home-api-bootstrap-0.1.0.jar

EXPOSE 8080

CMD ["java", "-jar", "my-home-api-bootstrap-0.1.0.jar"]