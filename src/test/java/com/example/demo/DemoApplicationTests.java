package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void contextLoads() {


		//redisTemplate.opsForValue().set("mykey","陈宗义1");
		 System.out.println("数据是" + redisTemplate.opsForValue().get("name"));
	}

}
