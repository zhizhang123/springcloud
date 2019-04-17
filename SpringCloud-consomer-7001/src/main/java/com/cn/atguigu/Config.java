package com.cn.atguigu;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class Config {

	@Bean
	@LoadBalanced
	RestTemplate rest() {
		System.out.println("===================注入=====================");
		return new RestTemplate();
	}
	
	/**
	 *    Rabbin  @LoadBalanced 默认是轮询服务
	 *   		 总共有七种模式  按照自己的算法找服务
	 *   	RandomRule	 随机策略
	 *   	RetryRule   轮询  有个一个服务断掉 自动切换
	 *      自定义Rabbin算法  实现抽象类 
	 * @return
	 */
		//	@Bean
		//	public IRule irule() {
		//		return new RandomRule();
		//	}
}
