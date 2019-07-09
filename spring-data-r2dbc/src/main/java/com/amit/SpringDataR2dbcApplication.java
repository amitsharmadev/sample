package com.amit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringDataR2dbcApplication implements CommandLineRunner {

	@Autowired
	  private  PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataR2dbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		  Logger logger = LoggerFactory.getLogger(SpringDataR2dbcApplication.class);
		  System.out.println("Coming.....");
		// TODO Auto-generated method stub'
		
		personRepository.save(new Person("Prince",40)).block();
		personRepository.save(new Person("Vikram",40)).block();
		personRepository.save(new Person("Arun",40)).block();
		personRepository.save(new Person("Princess",40)).block();
		//personRepository.findAll().subscribe(); //{ logger.info("findAll - $it"); }
	    //personRepository.findAllById(Mono.just(new Integer(1))).subscribe(); // { logger.info("findAllById - $it"); }
	    //personRepository.findAllByName("Arun").subscribe(); // { logger.info("findAllByName - $it"); }
	    //personRepository.findAllByAge(25).subscribe(); // { logger.info("findAllByAge - $it"); }
	    System.out.println("Coming.....");
		
	}

}
