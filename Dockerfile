FROM openjdk:22
ENV src/main/resources/ .env
ARG JAR_FILE=target/*.jar
COPY ./target/movies-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]