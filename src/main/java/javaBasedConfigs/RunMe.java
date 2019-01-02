package javaBasedConfigs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springSchedular.ScheduledTask;

public class RunMe {

	public static void main(String[] args) {
		 ApplicationContext ctx =new AnnotationConfigApplicationContext(MyConfigClass.class);
		   
		     // Theclass1 helloWorld = ctx.getBean(Theclass1.class);
		     // helloWorld.helloWorld();
		 ScheduledTask scheduled = ctx.getBean(ScheduledTask.class);
		 scheduled.demoServiceMethod();
	}

}
