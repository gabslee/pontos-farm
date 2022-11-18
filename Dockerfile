FROM openjdk:18
ARG JAR_FILE=out/artifacts/api_jar/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]