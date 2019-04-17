package com.cn.atguiku.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cn.atguigu.UserDo;
import com.cn.atguiku.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<UserDo> getlistAll() {
		// TODO Auto-generated method stub
		List<UserDo> list=new ArrayList<UserDo>();
		UserDo userdo = new UserDo();
		userdo.setId(1);
		userdo.setUsername("SpringCloud-Client-8083");
		userdo.setPassword("SpringCloud-Client-8083");
		UserDo userdo1 = new UserDo();
		userdo1.setId(2);
		userdo1.setUsername("SpringCloud-Client-8083");
		userdo1.setPassword("SpringCloud-Client-8083");
		list.add(userdo);
		list.add(userdo1);
		return list;
	}

}
