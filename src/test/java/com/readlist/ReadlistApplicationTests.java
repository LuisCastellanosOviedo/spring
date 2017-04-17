package com.readlist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("classpath:/app.properties")
public class ReadlistApplicationTests {

	@Test
	public void contextLoads() {
	}

}
