package javaBasedConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import springSchedular.ScheduledTask;

@Configuration
@EnableScheduling
public class MyConfigClass {

	@Bean(name="helloworldClass1")
	public Theclass1 myhelloworldmethod() {
		return new Theclass1();
	}
	
	@Bean(name="myscheduledTask")
	public ScheduledTask myscheduledTask() {
		return new ScheduledTask();
	}
	
}
