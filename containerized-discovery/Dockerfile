FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-discovery.jar
EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/containerized-discovery.jar"]