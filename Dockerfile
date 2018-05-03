FROM robbutcher2001/java8-tomcat8-docker

# Create app directory
RUN mkdir -p /app
WORKDIR /app

# Bundle app source
COPY butch-hello-world /app

# Build the app
RUN mvn install

# Move built artefacts to Tomcat
RUN mv target/classes /tomcat/webapps/ROOT/WEB-INF
RUN mv src/web.xml /tomcat/webapps/ROOT/WEB-INF

ENTRYPOINT [ "sh", "/tomcat/bin/catalina.sh", "run" ]
