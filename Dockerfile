FROM openjdk:8-jdk-alpine
MAINTAINER retnoayuningtyas <1931710174@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY program.java /java

#compile file java
RUN javac program.java

#running java
ENTRYPOINT java program