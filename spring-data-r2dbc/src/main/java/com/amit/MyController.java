package com.amit;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class MyController  {

	@Autowired
	PersonRepository personRepository;
	
	@GetMapping(value="/",produces="text/event-stream")
	public Flux<Person> getPersons(){
		return  personRepository.findAll().delayElements(Duration.ofSeconds(2));
	}
	
}
