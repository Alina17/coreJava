package com.practice.bank;

public interface Account {
	
	public void deposit(Double amount);
	public void withdraw(Double amount);
	public void transfer(Account account, Double amount);
	public Double getBalance();
	
}
