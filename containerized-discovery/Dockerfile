FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-discovery.jar containerized-discovery.jar
ENTRYPOINT ["java", "-jar", "/containerized-discovery.jar"]
EXPOSE 8761
