package com.sh.spring07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main07 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring07.xml");
		ctx.registerShutdownHook();
		
		//// get the bean by the name spcified in @Component("name")
		//Account a1 = (Account) ctx.getBean("a1");
		
		//// If name is not given in @Component, default name is class name in camel case 
		//Account a1 = (Account) ctx.getBean("accountImpl");
		
		//// Can also get bean object by the type, instead of bean name.
		Account a1 = ctx.getBean(AccountImpl.class);
		System.out.println(a1);
	}
}


