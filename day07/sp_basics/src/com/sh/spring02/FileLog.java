package com.sh.spring02;

public class FileLog implements ILog {
	@Override
	public void log(String msg) {
		//TODO: Add msg into log file
		System.out.println("FILE : " + msg);
	}
}
