package com.sh.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class PersonImpl implements Person {
	@Value("#{vs.scanName()}")
	private String name;
	public PersonImpl() {
		this.name = "empty";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonImpl [name=" + name + "]";
	}
}
