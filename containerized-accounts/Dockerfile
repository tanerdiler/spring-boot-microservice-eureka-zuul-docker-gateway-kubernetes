FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/*.jar containerized-accounts.jar

ENTRYPOINT ["java", "-jar", "/containerized-accounts.jar"]