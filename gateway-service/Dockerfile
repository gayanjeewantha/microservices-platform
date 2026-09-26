FROM eclipse-temurin:25-jdk
WORKDIR /app
COPY pom.xml .
COPY .mvn/ .mvn
COPY mvnw .
RUN ./mvnw dependency:go-offline -B
COPY src ./src
RUN ./mvnw clean package -DskipTests
CMD ["java", "-jar", "target/gateway-service-0.0.1-SNAPSHOT.jar"]
