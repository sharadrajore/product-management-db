FROM openjdk:11
COPY target/ProductAppWithDB-0.0.1-SNAPSHOT.jar ProductAppWithDB-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ProductAppWithDB-0.0.1-SNAPSHOT.jar"]