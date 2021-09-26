package com.sync.word.process;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sync.word.util.ValidateKey;

@Component
public class DictinoryProcessor {

	@Autowired 	ValidateKey checker;
	private HashMap<String,Integer> dictionaryMap;
	public String addWord(String word) {
	if(dictionaryMap == null) {
		dictionaryMap = new HashMap<>();
	}
	if(checker.verifyKey(word) && dictionaryMap.containsKey(word)) {
		dictionaryMap.put(word, dictionaryMap.get(word)+1);
	}
	else if(checker.verifyKey(word)){
		dictionaryMap.put(word, 1);
	}
	else {
		System.out.println("invalid");
		return "Invalid word";
		
	}
	return "success";
	
}
public Integer getCount(String word) {
	word = checker.convertToEng(word);
	if(dictionaryMap.containsKey(word))		
		return dictionaryMap.get(word);
	else return 0;	
}

}
