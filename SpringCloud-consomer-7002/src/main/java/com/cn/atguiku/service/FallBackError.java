package com.cn.atguiku.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cn.atguigu.UserDo;


import feign.hystrix.FallbackFactory;

@Component
public class FallBackError implements FallbackFactory<UserService>{

	@Override
	public UserService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new UserService() {

			@Override
			public List<UserDo> getlistAll() {
				// TODO Auto-generated method stub
				List<UserDo> list=new ArrayList<UserDo>();
				UserDo userdo=new UserDo();
				userdo.setId(0);
				userdo.setUsername("null");
				userdo.setPassword("null");
				list.add(userdo);
				return list;
			}
			
		};
	}

}