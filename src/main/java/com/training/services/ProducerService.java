package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Producer;
import com.training.interfaces.ProducerServiceI;
import com.training.repo.ProducerRepo;

@Service
public class ProducerService implements ProducerServiceI{

	
	@Autowired
	private ProducerRepo producerRepo;
	
	

	@Override
	public boolean deleteById(String trainercode) {
		Producer producer = producerRepo.findById(trainercode).get();
		if(producer!=null)	{
			producerRepo.delete(producer);return true;}
		
		return false;
	}

	
	
}
