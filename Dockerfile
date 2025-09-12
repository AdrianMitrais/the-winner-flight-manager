FROM maven:3.8.7-openjdk-18-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files
COPY . ./

RUN mvn clean package -DskipTests

# Stage 2: Run the application with a lightweight JDK 21 runtime
FROM openjdk:21-jdk

# Set the working directory for the runtime container
WORKDIR /app

# Expose port 8080 for the application
EXPOSE 8080

# Copy the packaged JAR file into the container
COPY --from=build /app/target/*.jar thewinner-flight-manager.jar

# Specify the command to run on container startup
ENTRYPOINT ["java", "-jar", "thewinner-flight-manager.jar"]