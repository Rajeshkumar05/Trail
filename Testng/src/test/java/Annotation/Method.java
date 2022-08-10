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

public class Method {
	
	
	
	@BeforeSuite//before all[test,class,method]
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	
	
	
	@BeforeClass //before the first test method[before all method]
	public void beforeclass()
	{
		System.out.println("before class");
	}
	
	//@BeforeMethod //before each test method[before normal method]
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test(groups= "group1")
	public void b()
	{
		System.out.println("b");
	}
	
	@Test(groups= "group2")
	public void c()
	{
		System.out.println("c");
	}
	
	
	//@AfterMethod //after each test method [after normal method]
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	
	@AfterClass //after all the test methods[after all method]
	public void afterclass()
	{
		System.out.println("after class");
	}
	
	
	
	@AfterTest //after all the test methods belonging to the classes inside the <test> tag have run
	//[before all method,class] all class should in one test
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	//after all[test,class,method] no need all class in one test
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite");
	}
	
	//group execute only via suite others[method,class,test,suite] can execute via both class[testng test] and suite[testng suite]
	@AfterGroups(groups= "group1")//test related so all classes should within single test
	public void afterGroup()
	{
		System.out.println("after group");
	}
	
	

}
