package com.cn.atguiku.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.atguigu.UserDo;




public interface UserService {
	

	List<UserDo> getlistAll();
}
