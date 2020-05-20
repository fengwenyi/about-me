FROM openjdk:8-jdk-alpine
MAINTAINER Erwin Feng xfsy_2015@163.com

COPY build/libs/about-me-1.0.0.RELEASE /about-me.jar
ENTRYPOINT ["java", "-jar", "/about-me.jar"]