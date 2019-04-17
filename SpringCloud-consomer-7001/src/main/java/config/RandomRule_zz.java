package config;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

/**
 *   自定义算法  
 * @author lenovo
 *
 */

public class RandomRule_zz extends AbstractLoadBalancerRule{
	
	
	
	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Server choose(Object key) {
		// TODO Auto-generated method stub
		return null;
	}



}
