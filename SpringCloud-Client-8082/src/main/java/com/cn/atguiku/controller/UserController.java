package com.cn.atguiku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.atguigu.UserDo;
import com.cn.atguiku.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;
	
	@RequestMapping("/getlistAll")
	public List<UserDo> getlistall(){
		return userservice.getlistAll();
	}
}
