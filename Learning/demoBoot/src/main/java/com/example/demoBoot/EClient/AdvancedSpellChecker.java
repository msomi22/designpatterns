package com.example.demoBoot.EClient;

import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellChecker implements SpellChecker {

	@Override
	public String checkSpelling(String message) {
		System.out.println("AdvancedSpellChecker");
		return message;
	}

}
