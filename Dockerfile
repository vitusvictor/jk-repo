FROM openjdk:8
EXPOSE 8080
ADD /target/jk-repo.jar jk-repo.jar
ENTRYPOINT ["java", "-jar", "jk-repo.jar"]