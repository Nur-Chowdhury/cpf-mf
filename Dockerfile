FROM maven:3.8.3-openjdk-11 AS build
COPY ..
RUN mvn clean package -DskipTests

FROM openjdk:11.0.13-jdk-slim
COPY --from=build /target/p-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]