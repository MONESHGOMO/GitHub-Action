# Use a Java runtime as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file from target directory
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8089

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
