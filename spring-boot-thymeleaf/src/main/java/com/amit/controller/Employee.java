package com.amit.controller;

public class Employee {

	String name;
	int code;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int code, int salary) {
		super();
		this.name = name;
		this.code = code;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
}
