FROM openjdk:8-jdk

ADD target/customer.jar /customer.jar

# ADD /camunda-license.txt /camunda-license.txt

EXPOSE 8082

CMD ["java","-jar","/customer.jar"]
