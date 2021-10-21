package com.fullstackmania.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackmania.demo.Model.Message;

@RestController
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello-world")
	public Message getMessage() {
		log.info("Hello-world endpoint is called");
		return new Message("Hello-world");
	}

}
