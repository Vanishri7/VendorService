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

import com.training.interfaces.MyFeignClient;
import com.training.interfaces.ProducerServiceI;

@RequestMapping("/customer/api")
@RestController
public class CustomerControllerFeign {

	@Autowired
	private ProducerServiceI producerService;
	
	//localhost:8093/customer/api/getpbook/isbn/456/qty/10
	@DeleteMapping("/deleteProducer/trainercode/{trainercode}") 
	public boolean deleteProducer(@PathVariable("trainercode") String trainercode)
	{
		return producerService.deleteById(trainercode);
	}
	
	
	
	
}
