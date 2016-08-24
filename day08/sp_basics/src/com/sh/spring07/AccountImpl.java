package com.sh.spring07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("a1")
public class AccountImpl implements Account {
	private int accId;
	private String type;
	private double balance;
	@Autowired
	private Person accHolder;
	public AccountImpl() {
		this(0, "", 0.0, null);
	}
	public AccountImpl(int accId, String type, double balance, Person accHolder) {
		this.accId = accId;
		this.type = type;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	@PostConstruct
	public void initAccount() {
		System.out.println("Account.initAccount() called...");
	}
	@PreDestroy
	public void destroyAccount() {
		System.out.println("Account.destroyAccount() called...");
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	@Override
	public String toString() {
		return String.format("AccountImpl [accId=%s, type=%s, balance=%s, accHolder=%s]", accId, type, balance,
				accHolder);
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
}

