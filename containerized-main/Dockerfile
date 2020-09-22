FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-main.jar

ENTRYPOINT ["java", "-jar","--spring.profiles.active=docker", "/containerized-main.jar"]

EXPOSE 8093
