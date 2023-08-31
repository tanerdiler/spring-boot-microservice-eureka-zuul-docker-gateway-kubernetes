FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-orders.jar containerized-orders.jar
ENTRYPOINT ["java", "-jar", "/containerized-orders.jar"]
EXPOSE 2222
