package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration; 
	
	//@RequestMapping(method = RequestMethod.GET,path="/limit")
	@GetMapping("/limits")//
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		//return new LimitsConfiguration(100,1);
		return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}

}
