package com.camunda.consulting.customer;

import org.camunda.bpm.engine.ProcessEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderSimulator {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderSimulator.class);

	@Autowired
	private ProcessEngine processEngine;

	private int counter = 0;

	@Scheduled(fixedRate = 5000)
	public void completeOneTaskRandomly() {
		LOGGER.info("Firing new order");
		processEngine.getRuntimeService().startProcessInstanceByKey("interEngineMessaging_orderInitiator",
				Integer.valueOf(++counter).toString());
	}

	
}
