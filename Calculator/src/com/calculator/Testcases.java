package com.calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class Testcases {
	
	@Test(groups = {"add"})
	public void testpass()
	{
		assertEquals(calculate.add(10,20),30);
		System.out.println("Addition Pass");
	}
	
	@Test(groups = {"add"})
	public void testfail()
	{
		assertEquals(calculate.add(10,20),10);
		System.out.println("Addition Fail");
	}
	
	@Test(groups = {"sub"})
	public void testpass1()
	{
		assertEquals(calculate.sub(20,10),10);
		System.out.println("Subtraction Pass");
	}
	
	@Test(groups = {"sub"})
	public void testfail1()
	{
		assertEquals(calculate.sub(20,10),100);
		System.out.println("Subtraction Fail");
	}

	@Test
	public void testpass2()
	{
		assertEquals(calculate.mul(10,20),200);
		System.out.println("Multiplication pass");
	}
	
	@Test
	public void testfail2()
	{
		assertEquals(calculate.mul(10,20),10);
		System.out.println("Multiplication Fail");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Before Method");
	}
	
	@Test(dataProvider = "dataparam")
	public void paramdata(String user,String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	}
	
	
	@DataProvider(name = "dataparam")
	public Object[][] dataparam()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[2][0] = "user3";
		data[2][1] = "pass3";
		return data;
		
		}
	
	@Test(expectedExceptions = {IllegalArgumentException.class})
	   public void testDivByZero() {
		System.out.println("Exception");
	      calculate.div(10, 0);
	   }
	
	}

