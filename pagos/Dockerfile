FROM openjdk:latest

WORKDIR /pagos
COPY ./target/pagos-0.0.1-SNAPSHOT.jar /pagos

EXPOSE 8088

CMD ["java", "-jar", "pagos-0.0.1-SNAPSHOT.jar"]