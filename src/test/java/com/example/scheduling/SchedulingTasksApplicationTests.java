package com.example.scheduling;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SchedulingTasksApplicationTests {

	@SpyBean
	private ScheduledTask tasks;

	@Test
	public void contextLoads() {
		assertThat(tasks).isNotNull();
	}

}
