package com.microservices.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("limits-service")
@Getter @Setter
public class LimitServiceConfiguration {
	private int minimum;
	private int maximum;

}
	