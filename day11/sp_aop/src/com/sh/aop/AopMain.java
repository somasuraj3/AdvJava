package com.sh.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		ctx.registerShutdownHook();
		Account a1 = ctx.getBean(Account.class);
		System.out.println(a1);
		System.out.println(a1.getAccHolder());
		a1.setBalance(10000);
		a1.withdraw(2000);
		a1.deposit(1500);
		System.out.println("New Balance : " + a1.getBalance());
	}
}
