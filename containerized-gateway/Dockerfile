FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-gateway.jar
EXPOSE 8762
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar"]