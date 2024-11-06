FROM gradle:7.4.2-jdk17 AS build
WORKDIR /app
COPY . .
RUN cd /app && gradle clean build -x test --no-daemon
RUN ls -la /app

FROM openjdk:17-jdk
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "/app.jar"]
