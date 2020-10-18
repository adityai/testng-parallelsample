package com.iaditya.testng.parallelsample;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ParallelMethodTest 
{
    private static Map<String, Map<String, String>> testDataMap = null;
    
    @BeforeSuite
    public void getData() {
        System.out.println("Get data method");
        Map<String, String> testMethodsOneMap = new HashMap<String, String>();
        Map<String, String> testMethodsTwoMap = new HashMap<String, String>();
        testMethodsOneMap.put("test-data", "test data for testMethodsOne");
        testMethodsTwoMap.put("test-data", "test data for testMethodsOne");
        testDataMap = new HashMap<String, Map<String, String>>();
        testDataMap.put("testMethodsOne", testMethodsOneMap);
        testDataMap.put("testMethodsTwo", testMethodsTwoMap);
    }

    @Test
    public void testMethodsOne() {
        System.out.println("Test data: " + testDataMap.get("testMethodsOne").get("test-data"));
    }

    @Test
    public void testMethodsTwo() {
        System.out.println("Test data: " + testDataMap.get("testMethodsTwo").get("test-data"));
    }
 
}
