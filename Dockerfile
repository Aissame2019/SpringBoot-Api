FROM openjdk:17-jdk-alpine
ADD target/demo2-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]