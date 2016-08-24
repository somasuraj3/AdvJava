package com.sh.aop;

public interface Account {
	void setBalance(double balance);
	double getBalance();
	Person getAccHolder();
	void setAccHolder(Person person);
	void deposit(double amount);
	void withdraw(double amount);
}

