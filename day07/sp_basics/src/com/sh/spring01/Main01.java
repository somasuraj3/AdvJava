package com.sh.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring01.xml");
		
		IBox b = (IBox) ctx.getBean("b3");
		System.out.println("Vol : " + b.calcVolume());
	}
}
