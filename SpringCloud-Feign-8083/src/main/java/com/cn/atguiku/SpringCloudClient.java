package com.cn.atguiku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudClient {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClient.class, args);
	}
}