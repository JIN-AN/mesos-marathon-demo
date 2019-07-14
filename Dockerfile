FROM java:openjdk-8-jre-alpine

WORKDIR /app

ADD target/*.jar /app

# Define environment variable
#ENV DOCKER_VAR "deneme ali veli"

CMD java -jar ./demo-0.0.1-SNAPSHOT.jar
