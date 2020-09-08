package com.winkeyes.lookup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winkeyes.lookup.service.ILookupService;
import com.winkeyes.lookup.service.LookupService;

@RestController
@RequestMapping("/lookup")
public class MainController {
	
	@Autowired
	public ILookupService service;
	
	@GetMapping(value = "time")
	public String  hello() {
		
		return service.getAck();
	}
	
	@GetMapping(value = "test")
	public String  testme() {
		
		return "I AM AVAILABLE!!";
	}

}
