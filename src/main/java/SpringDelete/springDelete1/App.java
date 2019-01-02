package SpringDelete.springDelete1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_config.xml");
    	SecondaryClass sc=(SecondaryClass) ctx.getBean("my_secondaryclass");
    	
    	System.out.println("=======SecondaryClass=======");
    	sc.getMclass().displayMessage();
    	
    	
    	System.out.println("\n====Main Class=========");
    	MainClass mc=(MainClass) ctx.getBean("my_mainClass");
    	mc.displayMessage();
    }
}
