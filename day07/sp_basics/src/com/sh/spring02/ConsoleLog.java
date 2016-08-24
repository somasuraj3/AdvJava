package com.sh.spring02;

public class ConsoleLog implements ILog {
	@Override
	public void log(String msg) {
		System.out.println("CONS: " + msg);
	}
}
