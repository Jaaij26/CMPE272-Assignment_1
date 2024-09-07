FROM openjdk:17
WORKDIR /app
COPY target/docker_sb_world.jar docker_sb_world.jar
ENTRYPOINT ["java","-jar","docker_sb_world.jar"]