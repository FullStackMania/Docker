package com.fullstackmania.demo.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {
	
	private static final Logger log = LoggerFactory.getLogger(Message.class);


	private String Greeting;

	public Message() {
	}

	public String getGreeting() {
		return Greeting;
	}

	public void setGreeting(String greeting) {
		Greeting = greeting;
	}

	public Message(String greeting) {
		super();
		log.info("Entered into Message constructor");
		Greeting = greeting;
	}

	@Override
	public String toString() {
		return "Message [Greeting=" + Greeting + "]";
	}

}
