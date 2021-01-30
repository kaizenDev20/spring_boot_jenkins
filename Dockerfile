FROM openjdk:8
EXPOSE 8080
ADD target/spring_boot_jenkins.jar docker_spring_boot_jenkins.jar
ENTRYPOINT ["java", "-jar", "/docker_spring_boot_jenkins.jar"]