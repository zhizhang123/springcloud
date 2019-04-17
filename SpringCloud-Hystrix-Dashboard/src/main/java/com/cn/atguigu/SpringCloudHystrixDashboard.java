package com.cn.atguigu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudHystrixDashboard {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixDashboard.class, args);
	}
}
