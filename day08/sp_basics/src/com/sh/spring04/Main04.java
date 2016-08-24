package com.sh.spring04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main04 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring04.xml");
		ctx.registerShutdownHook();
		
		BoxDao dao = (BoxDao) ctx.getBean("bd");
		
		Box box = ctx.getBean(Box.class);
		dao.add(box);
		
		for (Box b : dao.getBoxList()) {
			System.out.println(b);
		}
	}
}
