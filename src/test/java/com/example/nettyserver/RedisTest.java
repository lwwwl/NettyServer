package com.example.nettyserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description: TODO
 * @author: i_laowei
 * @date: 2021/1/18  16:57
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Test
    public void contextLoads() {
        redisTemplate.opsForValue().set("date", new Date());
        Date date = (Date) redisTemplate.opsForValue().get("test7");
        System.out.println(date);
    }
}
