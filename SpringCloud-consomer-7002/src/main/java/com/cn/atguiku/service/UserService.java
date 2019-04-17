package com.cn.atguiku.service;

import java.util.List;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.atguigu.UserDo;
import com.cn.atguiku.service.impl.UserServiceImpl;



@FeignClient(value="SpringCloud-Client",fallback=UserServiceImpl.class)
public interface UserService {
	
	@RequestMapping("/getlistAll")
	List<UserDo> getlistAll();
}