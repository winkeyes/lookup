package com.winkeyes.lookup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LookupService implements ILookupService {

	@Autowired
	public PlayroundClient client;

	@Override
	public String getAck() {
		ResponseEntity<String> obj = client.getAck();
		return obj.getBody();
	}

	
}
