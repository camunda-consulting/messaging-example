FROM openjdk:8-jdk

ADD target/orderFulfiller.jar /fulfiller.jar

# ADD /camunda-license.txt /camunda-license.txt

EXPOSE 8081

CMD ["java","-jar","/fulfiller.jar"]
