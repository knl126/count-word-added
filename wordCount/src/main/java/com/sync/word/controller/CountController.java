package com.sync.word.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sync.word.process.DictinoryProcessor;

@RestController
public class CountController {

@Autowired DictinoryProcessor dictionary;

	@GetMapping("/word/getCount/{searchKey}")
	public int getCount(@PathVariable  String searchKey) {
	return dictionary.getCount(searchKey);
	}
	
	@PostMapping("/word/add")
	public String add(@RequestBody String word) {
		return dictionary.addWord(word);
	}
}
