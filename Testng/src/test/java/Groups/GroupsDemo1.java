package Groups;

import org.testng.annotations.Test;

public class GroupsDemo1 {
	
	@Test(groups= {"1stgroup"})
	public void Test1()
	{
		System.out.println("Test1 in 1st group");
	}
	
	@Test(groups= {"2ndgroup"})
	public void Test2()
	{
		System.out.println("Test2 in 2nd group");
	}
	//we can assign one or more group 
	@Test(groups= {"1stgroup","2ndgroup"})
	public void Test3()
	{
		System.out.println("Test3 in 1st & 2nd group");
	}
	
	@Test(groups= {"1stgroup"})
	public void Test4()
	{
		System.out.println("Test4 in 1st group");
	}


}
