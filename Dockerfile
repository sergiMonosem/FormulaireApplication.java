FROM openjdk:17
EXPOSE 8080
add target/app.jar app.jar

ENTRYPOINT["java", "-jar", "app.jar"]