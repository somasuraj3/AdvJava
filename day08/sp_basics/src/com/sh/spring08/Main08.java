package com.sh.spring08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main08 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring08.xml");
		ctx.registerShutdownHook();
		Box b = ctx.getBean(Box.class);
		System.out.println(b);
		b = ctx.getBean(Box.class);
		System.out.println(b);
		b = ctx.getBean(Box.class);
		System.out.println(b);
	}
}
