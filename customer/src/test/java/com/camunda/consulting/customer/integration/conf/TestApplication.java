package com.camunda.consulting.customer.integration.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.camunda.consulting.customer.CamundaApplication;

@ComponentScan(basePackageClasses = {CamundaApplication.class})
@EnableAutoConfiguration
@TestConfiguration
public class TestApplication {

}
