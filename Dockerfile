FROM openjdk:14.0-jdk-slim
EXPOSE 8087
VOLUME /tmp
ADD ./target/ServicioMutantes-0.0.1-SNAPSHOT.jar servicio.jar
ENTRYPOINT ["java","-jar","/servicio.jar"]