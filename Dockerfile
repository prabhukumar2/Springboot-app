FROM openjdk:11
VOLUME /tmp
EXPOSE 9090
ARG JAR_FILE=desktop/spring-boot-docker.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]