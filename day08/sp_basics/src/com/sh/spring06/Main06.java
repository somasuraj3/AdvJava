package com.sh.spring06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main06 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring06.xml");
		ctx.registerShutdownHook();
		
		Account a1 = (Account) ctx.getBean("a1");
		System.out.println(a1);
		
		/*
		Account a2 = (Account) ctx.getBean("a2");
		System.out.println(a2);
		*/
	}
}


