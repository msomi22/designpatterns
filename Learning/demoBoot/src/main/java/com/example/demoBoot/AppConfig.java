package com.example.demoBoot;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//import com.example.demoBoot.EClient.AdvancedSpellChecker;
//import com.example.demoBoot.EClient.BasicSpellChecker;
//import com.example.demoBoot.EClient.EmailClient;

@ComponentScan(basePackages = "com.example.demoBoot.EClient")
public class AppConfig {
    /*
	@Bean(name = "basicSpellChecker")
	public BasicSpellChecker createBasicSpellChecker() {
		return new BasicSpellChecker();
	}
	
	@Bean(name = "advancedSpellChecker")
	public AdvancedSpellChecker createAdvancedSpellChecker() {
		return new AdvancedSpellChecker();
	}
	
	@Bean(name = "emailClient")
	public EmailClient createEmailClient() {
		EmailClient ec = new EmailClient();
		ec.setSpellChecker(createAdvancedSpellChecker());
		return ec;
		//return new EmailClient(createAdvancedSpellChecker());
	}
	*/
}
