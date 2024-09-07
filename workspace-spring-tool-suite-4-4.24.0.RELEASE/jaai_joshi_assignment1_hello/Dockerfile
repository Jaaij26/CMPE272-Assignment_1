FROM openjdk:17
WORKDIR /app
COPY target/docker_sb_hello.jar docker_sb_hello.jar
ENTRYPOINT ["java","-jar","docker_sb_hello.jar"]