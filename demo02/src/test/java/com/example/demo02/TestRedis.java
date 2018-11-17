package com.example.demo02;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRedis {

	@Test
	public void testRedis(){
		Jedis jedis = new Jedis("192.168.160.141",7000);
		jedis.set("name", "gushiyu");
		String s = jedis.get("name");
		String s1 = jedis.get("sex");
		System.out.println(s+s1);
		jedis.close();
		
	}
}
