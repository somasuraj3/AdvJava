package com.sh.spring06;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;

public class PersonImpl implements Person {
	private String name;
	private String address;
	private String email;
	public PersonImpl() {
		this("", "", "");
	}
	public PersonImpl(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	@PostConstruct
	public void initPerson() {
		System.out.println("Person.initPerson() called...");
	}
	@PreDestroy
	public void destroyPerson() {
		System.out.println("Person.destroyPerson() called...");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("PersonImpl [name=%s, address=%s, email=%s]", name, address, email);
	}
}
