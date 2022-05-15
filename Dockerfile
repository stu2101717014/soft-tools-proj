FROM openjdk:8-jdk-alpine

COPY ./soft-tools-proj/module-a/target/module-a-0.0.1-SNAPSHOT-spring-boot.jar ./

ENTRYPOINT ["java","-jar","module-a-0.0.1-SNAPSHOT-spring-boot.jar"]
