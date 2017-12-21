package com.camunda.consulting.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestMessageDto {
	String messageName, businessKey;

	public RestMessageDto(String messageName, String businessKey) {
		super();
		this.messageName = messageName;
		this.businessKey = businessKey;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

}
