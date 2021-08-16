package com.example.demoBoot.EClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@PropertySource(value = "classpath:/application.properties")
public class EmailClient {
	
	//advancedSpellChecker basicSpellChecker
	private final String type = "basicSpellChecker";
	
	@Value("${email.spell.checker.type}")
	private String name;
	
	//@Scheduled(fixedDelayString = "${reversal.worker.sleep.duration}", initialDelay = 500)
	
	@Autowired
	//This does not work >>>> @Qualifier(value="${email.spell.checker.type}") 
	@Qualifier(value = "advancedSpellChecker") 
	private SpellChecker spellChecker;
	
	public EmailClient() {
		
	}
	
	/*public EmailClient (SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}*/
	
	public void send(String msg) {
		System.out.println("name = " + name);
		spellChecker.checkSpelling(msg);
	}
/*
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	@Autowired
	public void setSpellChecker(@Qualifier("advancedSpellChecker") SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}*/
}
