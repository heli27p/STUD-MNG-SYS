FROM openjdk:21-jdk-alpine

EXPOSE 8081

ADD target/STUD-MNG-SYS-0.0.1-SNAPSHOT.jar stud-mng-sys.jar

ENTRYPOINT ["java", "-jar", "/stud-mng-sys.jar"]