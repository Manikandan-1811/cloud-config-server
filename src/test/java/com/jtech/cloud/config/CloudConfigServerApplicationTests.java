package com.jtech.cloud.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CloudConfigServerApplicationTests {

	@Autowired
	private CloudConfigServerApplication application;
	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
