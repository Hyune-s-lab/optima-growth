FROM openjdk:17-jdk-slim-buster
ENV SERVER_PORT=8080
ARG JAR_FILE=/licensing-service/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
