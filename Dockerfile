FROM openjdk:8
EXPOSE 8080
ENTRYPOINT ["java","-jar","Demo.jar"]
ADD target/Demo.jar Demo.jar