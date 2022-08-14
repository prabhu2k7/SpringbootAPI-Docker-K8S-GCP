FROM java:8

EXPOSE 8080

ADD target/SpringbootAPI-2.6.0.jar SpringbootAPI-2.6.0.jar

ENTRYPOINT ["java","-jar","SpringbootAPI-2.6.0.jar"]


