package com.wipro.Spring.SpringExample;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    
    	//do the configuration on the basis of annotation
    	
    	//in this provide a config file to provide the package where your classes 
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
          Delegate d = context.getBean(Delegate.class);
          d.notifyUser();
          
    }
}
