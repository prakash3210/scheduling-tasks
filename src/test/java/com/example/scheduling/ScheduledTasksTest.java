package com.example.scheduling;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.awaitility.Awaitility;
import org.awaitility.Duration;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ScheduledTasksTest {
	
	@SpyBean
	ScheduledTask tasks;

	@Test
	public void reportCurrentTime() {
		
		Awaitility.await().atMost(Duration.TEN_SECONDS).untilAsserted(() -> { verify(tasks,
		  atLeast(2)).reportCurrentTime(); });
		 
	}

}
