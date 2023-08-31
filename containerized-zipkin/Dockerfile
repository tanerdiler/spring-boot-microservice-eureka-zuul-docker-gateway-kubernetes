FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-gateway.jar containerized-gateway.jar
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar"]
EXPOSE 8761
