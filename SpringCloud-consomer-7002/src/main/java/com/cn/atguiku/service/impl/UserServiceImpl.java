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
		UserDo userdo=new UserDo();
		userdo.setId(0);
		userdo.setUsername("UserServiceImpl");
		userdo.setPassword("UserServiceImpl");
		list.add(userdo);
		return list;
	}

}
