package com.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.Producer;


@Repository
public interface ProducerRepo extends JpaRepository<Producer, String> {

	
	
}
	