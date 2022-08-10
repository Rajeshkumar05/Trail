package Testngpack;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void startApp()
	{
		System.out.println("startappppp");
		
	}
	
	//dependsOnMethods()==>will return String[]
	@Test(dependsOnMethods="startApp")
	public void logIn()
	{
		System.out.println("loginnn");
		Assert.assertEquals(12, 13);
	}
	
	//will skip the dependent cases
	@Test(dependsOnMethods="logIn")
	public void logOut()
	{
		System.out.println("logouttt");
	}

}
