package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceImp implements FeignService{

	@Override
	public String getFeignInterface(String name) {
		
		return "error "+name;
	}

}
