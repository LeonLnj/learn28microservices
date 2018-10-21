package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.config.LimitConfiguration;
import com.microservices.limitsservice.config.LimitServiceConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitServiceConfiguration limitServiceConfiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(limitServiceConfiguration.getMaximum(), limitServiceConfiguration.getMinimum());
	}

}
