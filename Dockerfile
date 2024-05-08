FROM openjdk:17
EXPOSE 8080
ADD target/sb-demo.jar sb-demo.jar
ENTRYPOINT ["java","-jar","sb-demo.jar"]