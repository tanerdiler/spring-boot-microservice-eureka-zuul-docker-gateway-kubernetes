FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-products.jar containerized-products.jar
ENTRYPOINT ["java", "-jar", "/containerized-products.jar"]
EXPOSE 2222
