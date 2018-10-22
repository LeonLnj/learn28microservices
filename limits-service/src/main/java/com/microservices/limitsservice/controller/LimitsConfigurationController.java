package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.config.LimitServiceConfiguration;
import com.microservices.limitsservice.modal.Limits;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitServiceConfiguration limitServiceConfiguration;
	
	@GetMapping("/limits")
	public Limits retrieveLimitsFromConfiguration() {
		return new Limits(limitServiceConfiguration.getMaximum(), limitServiceConfiguration.getMinimum());
	}

}
