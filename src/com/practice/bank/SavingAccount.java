package com.practice.bank;

public class SavingAccount implements Account {

	private Double balance;

	
	public SavingAccount(Double balance) { this.balance = balance; }

	@Override
	public void deposit(Double amount) { balance+=amount; }

	public void withdraw(Double amount) {
		if(0 < balance - amount ) { System.out.println("Can not withdraw more that you have!"); }
		else{ balance-= amount; }
	}

	public void transfer(Account account, Double amount) {
		withdraw(amount);
		account.deposit(amount);
	}

	@Override
	public Double getBalance() {
		return balance;
	}

	public void transfer(Account account) {
		// TODO Auto-generated method stub
		
	}
	

	

}
