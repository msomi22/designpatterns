package com.example.demoBoot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demoBoot.EClient.EmailClient;

@SpringBootApplication
public class DemoBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext mycontext = SpringApplication.run(DemoBootApplication.class, args);
	    
		System.out.println("Boot starting");
		String[] beans = mycontext.getBeanDefinitionNames();
		
		Arrays.sort(beans);
		for(String bean : beans) {
			//System.out.println(">>>>>" + bean);
		}
		System.out.println("::::::: " + beans.length + "::::::::");
		
		/**
		 * #1
		 */
		//EmailClient eclient = new EmailClient(new BasicSpellChecker());
		
		/**
		 * #2
		 */
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//EmailClient eclient = context.getBean("emailClient", EmailClient.class);
		
		/**
		 * #3
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailClient eclient =  context.getBean("emailClient", EmailClient.class);
		/**
		 * 
		 */
		
		eclient.send("This is my email"); 
	
	
	}

}
