FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-orders.jar

ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=docker", "/containerized-orders.jar"]

EXPOSE 8092