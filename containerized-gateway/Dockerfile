FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-gateway-1.0.0-SNAPSHOT.jar containerized-gateway.jar
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar"]
EXPOSE 8761
