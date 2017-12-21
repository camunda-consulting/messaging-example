package com.camunda.consulting.orderFulfiller.integration.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.camunda.consulting.orderFulfiller.CamundaApplication;

@ComponentScan(basePackageClasses = {CamundaApplication.class})
@EnableAutoConfiguration
@TestConfiguration
public class TestApplication {

}
