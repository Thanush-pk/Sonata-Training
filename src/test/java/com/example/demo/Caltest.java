package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata1.Calculator;

class Caltest {
	Calculator c =new Calculator();
	@Test
	public void test() {
		Assertions.assertEquals(4, c.add(2,2));
	}
	@Test
	public void divtest() {
		//int x= c.div(1,1);
		assertThrows(ArithmeticException.class,()->c.div(1,0),"this is an error");
	}

}
