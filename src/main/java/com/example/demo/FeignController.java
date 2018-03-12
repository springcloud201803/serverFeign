package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

	@Autowired
	private FeignService feignService;
	@Autowired
	private TestFeignService testFeignService;
	@RequestMapping("getFeignInterface")
	@ResponseBody
	public String getFeignInterface(@RequestParam String name){
		return feignService.getFeignInterface(name);
	//	return testFeignService.getString(name);
	}
}
