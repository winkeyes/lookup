package com.winkeyes.lookup.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "playround", url = "${CLIENT_URL}")
public interface PlayroundClient {

	@RequestMapping(method = RequestMethod.GET, value = "/sayhello")
	public ResponseEntity<String> getAck();
}
