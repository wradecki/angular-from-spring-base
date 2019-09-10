FROM openjdk:12-alpine
VOLUME /tmp
ARG JAR_FILE
COPY backend/build/libs/backend.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]