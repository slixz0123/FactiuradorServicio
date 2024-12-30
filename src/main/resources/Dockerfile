# Usa una imagen base con Java 17
FROM openjdk:17-jdk-slim
VOLUME /tmp

# Copia el archivo .jar generado en el contenedor
ARG JAR_FILE=target/FactiuradorServicio-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
COPY src/main/resources/application.properties src/main/resources/application.properties
# Expone el puerto 9898 para la aplicación
EXPOSE 9898

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
