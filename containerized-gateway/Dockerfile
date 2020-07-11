FROM openjdk
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-gateway-0.0.1.jar containerized-gateway.jar
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar"]
EXPOSE 8761
