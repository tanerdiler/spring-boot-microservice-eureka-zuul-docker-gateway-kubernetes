FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-discovery.jar

ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=docker", "/containerized-discovery.jar"]

EXPOSE 8761