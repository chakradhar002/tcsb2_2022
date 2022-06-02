package com.demo.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	@JmsListener(destination = "MESSAGE_QUEUE")
	void consume(String messge) {
		
		System.out.println("message received "+messge);
	}

}
