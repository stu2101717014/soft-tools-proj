FROM openjdk:8-jdk-alpine

COPY ./parent-proj/module-a/target/module-a-0.0.1-SNAPSHOT-spring-boot.jar ./

ENTRYPOINT ["java","-jar","module-a-0.0.1-SNAPSHOT-spring-boot.jar"]
