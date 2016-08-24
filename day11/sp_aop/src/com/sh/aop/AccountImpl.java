package com.sh.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccountImpl implements Account {
	@Value("#{vs.myBalance}")
	private double balance;
	@Value("#{p1}")
	private Person accHolder;
	public AccountImpl() {
		this.balance = 1000;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	@Override
	public String toString() {
		return "AccountImpl [balance=" + balance + "]";
	}
}
