FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/category-0.0.1-SNAPSHOT.jar category-0.0.1-SNAPSHOT.jar

# Chạy ứng dụng
CMD ["java", "-jar", "category-0.0.1-SNAPSHOT.jar"]
