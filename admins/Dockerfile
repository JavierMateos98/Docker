FROM openjdk:latest

WORKDIR /admins
COPY ./target/admins-0.0.1-SNAPSHOT.jar /admins

EXPOSE 8093

CMD ["java", "-jar", "admins-0.0.1-SNAPSHOT.jar"]