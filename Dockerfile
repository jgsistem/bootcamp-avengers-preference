#JAR
FROM openjdk:8
WORKDIR /
ADD target/bootcamp-avengers-preference.jar bootcamp-avengers-preference.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "bootcamp-avengers-preference.jar"]