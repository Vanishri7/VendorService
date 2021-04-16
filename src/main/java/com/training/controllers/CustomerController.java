package com.training.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.interfaces.ProducerServiceI;

@RequestMapping("/customer/api")
@RestController
public class CustomerController {

	@Autowired
	private RestTemplate restTemplate;
	private ProducerServiceI producerService;
	
	private String producerUrl= "http://localhost:8097/producer/api/getProducer/trainercode/{trainercode}";
	//localhost:8098/customer/api/deleteProducer/trainercode/TR001
	@DeleteMapping("/deleteProducer/trainercode/{trainercode}") 
	public boolean deleteProducer(@PathVariable("trainercode") String trainercode)
	{
		return producerService.deleteById(trainercode);
	}
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
}
