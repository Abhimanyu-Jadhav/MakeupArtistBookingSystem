FROM maven:3.8.8-openjdk-8 AS build
WORKDIR /workspace

# Copy only the files needed for build cache performance
COPY pom.xml ./
COPY src ./src

RUN mvn -B clean package

FROM openjdk:8-jre-slim
WORKDIR /app

COPY --from=build /workspace/target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
