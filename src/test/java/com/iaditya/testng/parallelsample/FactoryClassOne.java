package com.iaditya.testng.parallelsample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryClassOne {

	@Factory(dataProvider = "data")
    public Object[] factoryMethod(String fieldOne) {
        return new Object[] { new FactoryTestOne(fieldOne) };
    }
	
	@DataProvider(name = "data")
	private Object[][] getData() {

		Object[][] tableData = { {"Line 1"}, {"Line 2"}, {"Line 3"}, {"Line 4"}, {"line 5"}, {"line 6"}, {"line 7"}, {"line 8"}, {"line 9"}};
		return tableData;
	}


}
