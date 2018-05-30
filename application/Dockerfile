FROM robbutcher2001/java8-tomcat8-docker

# Create app directory
RUN mkdir -p /app
WORKDIR /app

ADD target/butch-application-0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
