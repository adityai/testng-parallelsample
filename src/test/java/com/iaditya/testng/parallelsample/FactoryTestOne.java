package com.iaditya.testng.parallelsample;

import org.testng.annotations.Test;

public class FactoryTestOne {

	public String fieldOne = null;
	
	public FactoryTestOne(String fieldOne) {
		// TODO Auto-generated constructor stub
		this.fieldOne = fieldOne;
	}
	
	@Test()
	public void testFactoryOneMethod1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(this.getClass().getName() + " " + fieldOne);
	}

}
