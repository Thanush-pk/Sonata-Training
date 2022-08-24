package com.sonata1;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int a =c.add(2,4);
		System.out.println("Adddittion \t"+a);
		int m=c.mul(2, 4);
		System.out.println("MUltiplication \t"+m);
		
	}

}
