package com.sh.aop;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("vs")
public class ValueStoreImpl implements ValueStore {
	private Scanner sc = new Scanner(System.in);
	public double getMyBalance() {
		//return 4000;
		System.out.println("Enter Balance : ");
		return sc.nextInt();
	}
	public String scanName() {
		//return "Nilesh";
		System.out.println("Enter Name : ");
		return sc.next();
	}
}
