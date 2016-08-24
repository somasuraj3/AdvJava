package com.sh.spring04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main04 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring03.xml");
		ctx.registerShutdownHook();
		
		IBox b = (IBox) ctx.getBean("b1");
		System.out.println("Vol : " + b.calcVolume());
		
		b = (IBox) ctx.getBean("b1");
		System.out.println("Vol : " + b.calcVolume());
		
		b = (IBox) ctx.getBean("b1");
		System.out.println("Vol : " + b.calcVolume());
	}
}
