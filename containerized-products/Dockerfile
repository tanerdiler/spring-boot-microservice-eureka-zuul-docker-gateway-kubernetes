FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-products-1.0.0-SNAPSHOT.jar containerized-products.jar
ENTRYPOINT ["java", "-jar", "/containerized-products.jar"]
EXPOSE 2222
