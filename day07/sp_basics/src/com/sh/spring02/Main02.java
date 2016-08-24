package com.sh.spring02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring02.xml");
		
		IBox b = (IBox) ctx.getBean("b1");
		System.out.println("Vol : " + b.calcVolume());
	}
}
