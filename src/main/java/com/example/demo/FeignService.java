package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="server-web",fallback=FeignServiceImp.class)
public interface FeignService {

	@RequestMapping(value="getStr",method=RequestMethod.GET)
	String getFeignInterface(@RequestParam(value="name") String name);
}
