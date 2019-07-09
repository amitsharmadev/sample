package com.amit.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amit.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${amit.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${amit.rabbitmq.routingkey}")
	private String routingkey;	
	String kafkaTopic = "jmy_topic";
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
		System.out.println("Send msg = " + company);
	    
	}
}