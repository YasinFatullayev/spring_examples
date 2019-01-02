package javaBasedConfigWithComponentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runme {

	public static void main(String[] args) {
		 //Method 1
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         
        //Method 2
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfigurations.class);
        ctx.refresh();
         
        MyTestClass mtc = ctx.getBean(MyTestClass.class);
        mtc.display();

	}

}
