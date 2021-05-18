FROM adoptopenjdk/openjdk11

WORKDIR /usr/src/app

COPY . .

RUN ./gradlew clean build

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/just-ask-master-0.0.1-SNAPSHOT.jar"]