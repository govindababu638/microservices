package com.limitservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limitservices.configuration.Configuration;
import com.limitservices.configuration.LimitConfiguration;

@RestController
public class LimitsController {
    @Autowired
	Configuration configuration;
	@GetMapping(value="/getlimit")
	public LimitConfiguration getLimit() {
		return new LimitConfiguration(configuration.getMax(), configuration.getMin());
	}
}
