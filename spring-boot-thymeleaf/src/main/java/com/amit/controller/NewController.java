package com.amit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

	@RequestMapping("/emps")
	public Employee getData() {
		return new Employee("Prince",101,89898);
	}
}
