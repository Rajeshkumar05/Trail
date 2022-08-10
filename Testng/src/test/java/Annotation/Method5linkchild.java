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

public class Method5linkchild extends Method4linkparent {
	
	@BeforeSuite//before all[test,class,method]
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@BeforeTest //before any test method belonging to the classes inside the <test> tag is run
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeClass //before the first test method
	public void beforeclass()
	{
		System.out.println("before class4");
	}
	
	
	
	@BeforeMethod //before each test method
	public void beforeMethod()
	{
		System.out.println("before method5");
	}
	
	@Test(groups= {"group1"})
	public void b5()
	{
		System.out.println("b5");
	}
	
	@Test(groups= {"group2"})
	public void c5()
	{
		System.out.println("c5");
	}
	
	
	@AfterMethod //after each test method[normal method]
	public void afterMethod()
	{
		System.out.println("after method5");
	}
	
	
	
	
	
	

}
