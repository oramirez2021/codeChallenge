FROM openjdk
MAINTAINER  Author Name <oramirez@gmil.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]