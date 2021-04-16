package com.training.interfaces;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.bean.Producer;

@FeignClient(name="eureka-client-producer")//, url="localhost:8090")
@RibbonClient(name="ribbonclient")
public interface MyFeignClient {

	@GetMapping("/customer/api/getProducer/trainercode/{trainercode}")
	public Producer getProducer(@PathVariable("trainercode") String trainercode);
}
