FROM eclipse-temurin:20.0.2_9-jre-alpine
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-accounts.jar containerized-accounts.jar
ENTRYPOINT ["java", "-jar", "/containerized-accounts.jar"]
EXPOSE 2222