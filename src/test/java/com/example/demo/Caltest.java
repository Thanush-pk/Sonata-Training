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
		
		assertThrows(ArithmeticException.class,()->c.div(10,2),"this is an error");
	}

}
