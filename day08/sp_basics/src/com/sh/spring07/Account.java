package com.sh.spring07;

public interface Account {

	int getAccId();

	void setAccId(int accId);

	String getType();

	void setType(String type);

	double getBalance();

	void setBalance(double balance);

	Person getAccHolder();

	void setAccHolder(Person accHolder);

	void deposit(double amount);

	void withdraw(double amount);

}