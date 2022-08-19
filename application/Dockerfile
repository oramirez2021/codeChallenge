FROM openjdk
MAINTAINER  Author Name <oramirez@gmail.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]