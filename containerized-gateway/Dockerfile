FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-gateway.jar

ENTRYPOINT ["java", "-jar","--spring.profiles.active=docker", "/containerized-gateway.jar"]

EXPOSE 8762