package com.sync.word.util;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
@Component
public class ValidateKey {
	private final static String REGEX_APLHA = "^[a-zA-Z]+$";
	
	public boolean verifyKey(String word) {
	word= convertToEng(word);
	Pattern expression = Pattern.compile(REGEX_APLHA);
	return expression.matcher(word).matches();
	}
	public String convertToEng(String word) {
		return word.strip();
	}

}
