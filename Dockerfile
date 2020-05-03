FROM openjdk:11
ADD target/covid-0.0.1-SNAPSHOT.jar covid-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "covid-0.0.1-SNAPSHOT.jar"]