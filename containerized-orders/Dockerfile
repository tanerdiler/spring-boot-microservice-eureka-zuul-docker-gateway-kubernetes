FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-orders.jar
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "/containerized-orders.jar"]
