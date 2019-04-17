package com.cn.atguigu.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class UserController {
	@Autowired
	RestTemplate restemplate;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping
	@HystrixCommand(fallbackMethod="findByIdFallback")
	public Map<String,Object> getlistall(){
		Map<String,Object> map= new HashMap<String,Object>();
		map.put("code","0");
		map.put("error","error");
		map.put("info","错误");
		map.put("data",restemplate.getForObject("http://SPRINGCLOUD-CLIENT/getlistAll", List.class));
		return map;
	}
	
	
	public Map<String,Object> findByIdFallback(){
		Map<String,Object> map= new HashMap<String,Object>();
		map.put("code","0");
		map.put("error","error");
		map.put("info","错误");
		map.put("data","data[]");
		return map;
	}
}
