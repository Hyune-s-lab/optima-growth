FROM openjdk:17-jdk-slim-buster
ARG JAR_FILE=/licensing-service/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
