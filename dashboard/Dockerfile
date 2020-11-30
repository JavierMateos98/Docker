FROM openjdk:latest

WORKDIR /dashboard
COPY ./target/dashboard-0.0.1-SNAPSHOT.jar /dashboard

EXPOSE 8092

CMD ["java", "-jar", "dashboard-0.0.1-SNAPSHOT.jar"]