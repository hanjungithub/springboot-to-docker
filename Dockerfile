FROM java:8
EXPOSE 8089
ARG JAR_FILE
ADD target/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]