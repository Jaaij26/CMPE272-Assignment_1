FROM openjdk:17
WORKDIR /app
ADD target/docker_sb_integrated.jar docker_sb_integrated.jar
ENTRYPOINT ["java","-jar","docker_sb_integrated.jar"]