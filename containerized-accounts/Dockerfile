FROM openjdk:8-jdk-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-accounts.jar

ENTRYPOINT ["java", "-jar", "--spring.profiles.active=docker", "/containerized-accounts.jar"]

EXPOSE 8090