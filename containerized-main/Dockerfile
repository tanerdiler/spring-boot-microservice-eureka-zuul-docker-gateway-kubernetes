FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-main.jar containerized-main.jar
ENTRYPOINT ["java", "-jar", "/containerized-main.jar"]
EXPOSE 2222
