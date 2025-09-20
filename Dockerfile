# ===========================
# 1. Build Stage
# ===========================
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (to leverage Docker caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the rest of the source code and build
COPY src ./src
RUN mvn clean package -DskipTests

# ===========================
# 2. Runtime Stage
# ===========================
FROM eclipse-temurin:21-jdk AS runtime
WORKDIR /app

# Copy only the built jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
