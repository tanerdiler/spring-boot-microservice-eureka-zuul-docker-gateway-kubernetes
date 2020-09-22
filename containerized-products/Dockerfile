FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-products.jar

ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=docker", "/containerized-products.jar"]

EXPOSE 8091
