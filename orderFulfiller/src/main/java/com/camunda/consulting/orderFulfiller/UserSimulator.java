package com.camunda.consulting.orderFulfiller;

import java.util.List;
import java.util.stream.IntStream;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UserSimulator {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserSimulator.class);

	@Autowired
	private ProcessEngine processEngine;

	@Scheduled(fixedDelay = 3000, initialDelay = 30000)
	public void completeEverySecondTask() {
		LOGGER.info("Checking for tasks to complete");
		TaskService taskService = processEngine.getTaskService();
		List<Task> tasks = taskService.createTaskQuery().active().list();
		IntStream.range(0, tasks.size()) //
				.filter(n -> n % 2 == 0) //
				.mapToObj(tasks::get) //
				.forEach(chosenTask -> {
					LOGGER.info("Completing task {} in process instance {}", chosenTask.getName(),
							chosenTask.getProcessInstanceId());
					taskService.complete(chosenTask.getId());
				});

		try {
			Thread.sleep((long) (Math.random() * 5000));
		} catch (InterruptedException e) {
			// ignore
		}
	}

}
