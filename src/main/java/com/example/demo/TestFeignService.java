package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TestFeignService {

	@Autowired
	private FeignService feignService;
	
	public String getString(String name) {
		return feignService.getFeignInterface(name);
	}
}
