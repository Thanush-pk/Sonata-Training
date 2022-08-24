package com.sonata1;

public class Arraysprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,10,30,40};
		for(int i=0;i<a.length;i++) {
			//int x=a[i];
			System.out.println(a[i]);
		}
		int [][]b= {{1,4},{5,
			8}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(" arr"+i+" "+j+b[i][j]);
			}
		}
	}

}
