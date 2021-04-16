package com.training.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.training.bean.Producer;


public interface ProducerServiceI {

	boolean deleteById(String trainercode);
}
