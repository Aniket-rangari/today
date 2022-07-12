FROM openjdk:11
ADD target/practiceprogramm-0.0.1-SNAPSHOT.jar  practiceprogramm-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar"," practiceprogramm-0.0.1-SNAPSHOT.jar"]