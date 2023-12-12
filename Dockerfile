FROM --platform=linux/amd64 maven:3.9.6-eclipse-temurin-17-alpine AS builder

WORKDIR /build

COPY . .

RUN mvn clean package


FROM --platform=linux/amd64 openjdk:17-alpine

WORKDIR /app

COPY --from=builder /build//target/agenda-0.0.1-SNAPSHOT.jar ./agenda.jar

RUN /bin/sh -c 'touch /app/agenda.jar'

CMD ["java", "-jar", "agenda.jar"]


