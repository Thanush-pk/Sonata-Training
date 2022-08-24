package com.sonata1;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit conversion
		int y=50; 
		double x=y;
		System.out.println("implicit conversion \n"+x);
		//Explicit conversion
		double z =85.55;
		int a = (int)z;
		System.out.println("explicit conversion\n"+a);
		// Autoboxing
		int i=10;
		Integer b=i;
		System.out.println("auto boxing\n"+b);
		//Unboxing
		char c ='c';
		Character d=c;
		System.out.println("Unboxing\n"+d);
	}

}
