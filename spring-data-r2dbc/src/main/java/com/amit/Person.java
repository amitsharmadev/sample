package com.amit;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("people")
public class Person {
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Id Integer id;
	public Person() {
		super();
	}
	public Person(Integer id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Person(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	String name;
	Integer age;
}
