package com.sh.spring05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main05 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
		
		IBox b1 = (IBox) ctx.getBean("getBoxB1");
		System.out.println(b1);
		
		IBox b2 = (IBox) ctx.getBean("b2");
		System.out.println(b2);
	}
}


