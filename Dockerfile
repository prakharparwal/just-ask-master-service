FROM adoptopenjdk/openjdk11

WORKDIR /usr/src/app

COPY build/libs/just-ask-master-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]