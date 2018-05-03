# java-docker-hey-world

## Running the app

Build the app using Docker with the command from this directory:

```bash
docker build -t heyworld .
```

This will:
- Pull down a Java 8 + Maven (w/ work proxy) + Tomcat 8 Docker image.
- Copy over the source code from the _butch-hello-world_ directory.
- Run `mvn install`.
- Copy the built artefacts to Tomcat.

Once the project has been built, run the image as a container in Docker using:

```bash
docker run -d -p 8080:8080 --name mycontainer heyworld
```

This will:
- Run the image as a container in detached mode.
- Forward ports 8080 to your laptop.

You should now be able to hit this URL to see the app: _http://localhost:8080/say-hi_

Feel free to make local changes to _butch-hello-world/src/main/java/com/website/App.java_! If you do, stop the container (see below), re-run the build and then the run command again.

## Stopping the app

Simply run `docker stop mycontainer`
