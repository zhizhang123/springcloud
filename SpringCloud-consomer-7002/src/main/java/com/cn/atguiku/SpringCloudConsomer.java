package com.cn.atguiku;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class SpringCloudConsomer {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsomer.class, args);
	}
}
