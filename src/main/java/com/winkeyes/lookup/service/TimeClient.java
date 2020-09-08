package com.winkeyes.lookup.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "time", url = "${CLIENT_URL}")
public interface TimeClient {

	@RequestMapping(method = RequestMethod.GET, value = "/time/today")
	public ResponseEntity<String> getAck();
}
