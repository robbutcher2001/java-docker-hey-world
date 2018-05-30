FROM java:8

# Create app directory
RUN mkdir -p /app
WORKDIR /app

ADD target/butch-application-0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
