package com.example.demo02;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class TestRedisShard {

	@Test
	public void testRedisShard(){
		//创建分片连接池
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(500);
		poolConfig.setMaxIdle(10);
		//准备redis的分片
		List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
		shards.add(new JedisShardInfo("192.168.160.141",7000));
		shards.add(new JedisShardInfo("192.168.160.141",7001));
		shards.add(new JedisShardInfo("192.168.160.141",7002));
		//创建分片的对象
		ShardedJedisPool jedisPool = new ShardedJedisPool(poolConfig, shards);
		ShardedJedis shardedJedis = jedisPool.getResource();
		//jedis取值操作
		for (int i = 0; i < 10; i++) {
			shardedJedis.set("n"+i, "我是分片操作"+i);
		}
		jedisPool.close();
	}
}
