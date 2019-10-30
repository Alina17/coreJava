package com.practice.bank;

public class BusinessAcount implements Account {
	
	private Double balance = 0D;
	private Double dailyLimit = 50000D;
	
	public BusinessAcount(Double balance) { this.balance = balance; }
	
	@Override
	public void deposit(Double amount) { balance+=amount; }
	
	public void withdraw(Double amount) {
		
		if(balance - amount < 0 ) { System.out.println("Can not withdraw more that you have!"); }
		else if(amount > dailyLimit) {System.out.println("More than daily limit, can not withdraw"); }
		else { balance-= amount; }
		
	}
	
	public void transfer(Account account, Double amount) {
		withdraw(amount);
		account.deposit(amount);
	}
	
	@Override
	public Double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	
	public void transfer(Account account) {
		// TODO Auto-generated method stub
		
	}

	
}
	
	
	
	


