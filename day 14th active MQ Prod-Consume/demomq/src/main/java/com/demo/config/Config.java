package com.demo.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class Config {

	@Value("${activemq.broker-url}")
	private String brokerurl;

	@Bean
	public Queue queue() {

		return (Queue) new ActiveMQQueue("MESSAGE_QUEUE");

	}

	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory fac = new ActiveMQConnectionFactory();

		fac.setBrokerURL(brokerurl);
		return fac;

	}

	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activeMQConnectionFactory());

	}

}
