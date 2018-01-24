package com.javacodegeeks.testng.maven.TestMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void AppTest1()
    {
       System.out.println("testing");
    }
    
    @Test
    public void AppTest2()
    {
     assertEquals(3,3);
    }
    
 }
