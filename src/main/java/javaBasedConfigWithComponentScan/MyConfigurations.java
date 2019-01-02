package javaBasedConfigWithComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "javaBasedConfigWithComponentScan")
public class MyConfigurations {

	/*
	 * Component scan annotation will find classes and create spring beans
	 * intelligintely no need to explicitly create beans here in configuration class
	 * if @ComponentScan annotation has been declared
	 * 
	 * */
	
}
