package com.sonata1 ;

public class Currentacc extends Bank {
	Currentacc(int n,String name, double b){
		super(n,name,b);
	}
	

	public Currentacc() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(c1.accName);
		Currentacc c2=new Currentacc(284,"ramesh",30000);
		//c1.accNo=236;
		System.out.println("The balance is"+c2.deposit(5000)); 
		System.out.println("The balance is"+c2.withdraw(5000)); 
	}

}
