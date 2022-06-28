package com.cg.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest1 {

	@Test
	public void test() {
		HelloWorld junit= new HelloWorld();
		int result = junit.add(4,2);
		assertEquals(6,result);
	}

}
