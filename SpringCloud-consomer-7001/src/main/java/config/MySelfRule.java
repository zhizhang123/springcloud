package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule irule() {
		return new RandomRule();
		//返回自定义的算法
		//return new RandomRule_zz();
	}
}
