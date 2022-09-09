package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonata1.ArraylistTest;

class ArrayTest {

	@Test
	public void test() {
		ArraylistTest arrobj= new ArraylistTest();
		arrobj.add(1);
		arrobj.add(2);
		arrobj.add(3);
		arrobj.add(4);
		arrobj.add(5);
		
		int size=arrobj.getsize();
		//System.out.println(size);
		assertEquals(5,size);
		
	}

}
