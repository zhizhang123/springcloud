package com.cn.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableEurekaServer
public class SpringCloudService {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudService.class, args);
	}
}
