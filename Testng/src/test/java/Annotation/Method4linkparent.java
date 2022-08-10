package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method4linkparent  {
	
	
	//after all[test,class,method] no need all class in one test
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("after Suite");
		}
	
	@AfterTest //after all the test methods belonging to the classes inside the <test> tag have run
	//[before all method,class] all class should in one test
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	@AfterClass //after all the test methods
	public void afterclass()
	{
		System.out.println("after class4");
	}
	
	
	@BeforeMethod //before each test method
	public void beforeMethod()
	{
		System.out.println("before method4");
	}
	
	@Test(groups= {"group1"})
	public void b4()
	{
		System.out.println("b4");
	}
	
	@Test(groups= {"group2"})
	public void c4()
	{
		System.out.println("c4");
	}
	
	
	@AfterMethod //after each test method[normal method]
	public void afterMethod()
	{
		System.out.println("after method4");
	}
	
	
	
	
	
	

}
