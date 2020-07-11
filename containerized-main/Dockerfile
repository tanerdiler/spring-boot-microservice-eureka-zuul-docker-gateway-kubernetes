FROM openjdk
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-main-0.0.1.jar containerized-main.jar
ENTRYPOINT ["java", "-jar", "/containerized-main.jar"]
EXPOSE 2222
