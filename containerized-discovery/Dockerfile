FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-discovery-1.0.0-SNAPSHOT.jar containerized-discovery.jar
ENTRYPOINT ["java", "-jar", "/containerized-discovery.jar"]
EXPOSE 8761
