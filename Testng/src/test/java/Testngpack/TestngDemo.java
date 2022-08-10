package Testngpack;

import org.testng.annotations.Test;

public class TestngDemo {
	//if set priority then wont run in alphabatic order will run in priority order
	//description is extra information that display in report
	@Test(priority=1,description="this is demo")
	public void demo()
	{
		System.out.println("welcome to testng2");
	}
	//it will support -[will execute 1st]
	@Test(priority=-1)
	public void aemo()
	{
		System.out.println("welcome to testng1");
	}
	
	@Test(priority=3)
	public void cemo()
	{
		System.out.println("welcome to testng3");
	}

}
