package com.biz.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SampleClientController {

	@Value("${message}")
	private String message;

	@Value("${name}")
	private String name;

	@GetMapping("/message")
	public String test() {
		return message;
	}

	@GetMapping("/name")
	public String name() {
		return name;
	}

}
