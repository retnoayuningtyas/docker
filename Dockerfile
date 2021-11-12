FROM openjdk:8-jdk-alpine
MAINTAINER retnoayuningtyas <1931710174@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Program.java /app

#compile file java
RUN javac Program.java

#running java
ENTRYPOINT java Program
