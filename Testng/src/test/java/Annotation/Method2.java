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

public class Method2  {
	
	
	@BeforeTest //before any test method belonging to the classes inside the <test> tag is run
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeClass //before the first test method
	public void beforeclass()
	{
		System.out.println("before class2");
	}
	
	//@BeforeMethod //before each test method
	public void beforeMethod()
	{
		System.out.println("before method2");
	}
	
	@Test(groups= {"group1"})
	public void b2()
	{
		System.out.println("b2");
	}
	
	@Test(groups= {"group2"})
	public void c2()
	{
		System.out.println("c2");
	}
	
	
	//@AfterMethod //after each test method[normal method]
	public void afterMethod()
	{
		System.out.println("after method2");
	}
	
	
	@AfterClass //after all the test methods
	public void afterclass()
	{
		System.out.println("after class2");
	}
	
	
	

}
