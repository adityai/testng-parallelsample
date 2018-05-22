package com.iaditya.testng.parallelsample;

import org.testng.annotations.Test;

public class FactoryTestTwo {
	
	public String fieldOne = null;
	
	public FactoryTestTwo(String fieldOne) {
		// TODO Auto-generated constructor stub
		this.fieldOne = fieldOne;
	}
	
	@Test()
	public void testFactoryTwoMethod1() {
		System.out.println(this.getClass().getName() + " " + fieldOne);
	}

}
