FROM gradle:7.4.2-jdk17 AS build
COPY . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle clean build --no-daemon

FROM openjdk:17-jdk
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "/app.jar"]
