package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method3  {
	
	
	
	
	@BeforeClass //before the first test method
	public void beforeclass()
	{
		System.out.println("before class3");
	}
	
	//@BeforeMethod //before each test method
	public void beforeMethod()
	{
		System.out.println("before method3");
	}
	
	@Test(groups= {"group1"})
	public void b3()
	{
		System.out.println("b3");
	}
	
	@Test(groups= {"group2"})
	public void c3()
	{
		System.out.println("c3");
	}
	
	
	//@AfterMethod //after each test method
	public void afterMethod()
	{
		System.out.println("after method3");
	}
	
	
	@AfterClass //after all the test methods
	public void afterclass()
	{
		System.out.println("after class3");
	}
	
	@BeforeGroups(groups= "group1")//test related so all classes should within single test
	public void beforeGroup()
	{
		System.out.println("before group");
	}

}
