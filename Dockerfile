FROM java:8-jdk-alpine
RUN ["ls"]
ADD ./target/lookup-0.0.1-SNAPSHOT.jar lookup-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=dev", "lookup-0.0.1-SNAPSHOT.jar"]