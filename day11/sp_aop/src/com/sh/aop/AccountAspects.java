package com.sh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspects {
	@Before("execution (* com.sh.aop.AccountImpl.set*(..))")
	public void logBefore(JoinPoint pt) {
		System.out.println("BEFORE : " + pt.getSignature());
	}
	@After("execution (* com.sh.aop.AccountImpl.get*(..))")
	public void logAfter(JoinPoint pt) {
		System.out.println("AFTER : " + pt.getSignature());
	}	
	@Around("execution (* com.sh.aop.Account.withdraw(..))") 
	public Object monitorWithdraw(ProceedingJoinPoint pt) throws Throwable {
		Account acc = (Account)pt.getTarget();
		System.out.println("AROUND: Balance Before : " + acc.getBalance());			
		Object res = pt.proceed();
		System.out.println("AROUND: Balance After : " + acc.getBalance());
		return res;
	}
	
	
	@Pointcut("execution (* com.sh.aop.AccountImpl.deposit(..))")
	public void onlyDeposit() { }
	
	@Pointcut("execution (* com.sh.aop.AccountImpl.withdraw(..))")
	public void onlyWithdraw() { }
	
	@Pointcut("onlyWithdraw() || onlyDeposit()")
	public void transaction() { }
	
	@After("transaction()")
	public void afterTransaction(JoinPoint pt) {
		System.out.println("AFTER TR : " + pt.getSignature());
	}
}
