package com.example.demoBoot.EClient;

import org.springframework.stereotype.Component;

@Component
public class BasicSpellChecker implements SpellChecker {

	@Override
	public String checkSpelling(String message) {
		System.out.println("BasicSpellChecker");
		return message;
	}

}
