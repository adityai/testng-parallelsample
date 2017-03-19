package com.iaditya.testng.parallelsample;

import org.testng.annotations.Test;

/**
 * Configuring a test method to run in multiple threads


 * @author adityai
 *
 */
public class IndependentTest 
{
    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
    public void testMethod() 
    {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }
}