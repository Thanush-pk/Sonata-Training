package com.sonata1;

public class Bank {
 

		int accNo;
		String accName;
		double balance;
		Bank(){}
		Bank(int n, String name, double b  ){
			this.accNo=n;
			this.accName=name;
			this.balance=b;
		}
		

	public double deposit(double amount){
		//System.out.println(this.accNo);
		double totalAmt=balance+amount;
		return totalAmt;
}
	public double withdraw(double amount) {
		double totBal=balance-amount;
		return totBal;

}
}
