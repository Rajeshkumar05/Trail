package Groups;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups= {"group 1st"},priority=1)
	public void Test1()
	{
		System.out.println("Test1 in 1st group with p1");
	}
	//priority for order
	//priority has more power than group in execution
	//if same priority  mapped for 2 case then 1st point will  be executed next 2nd
	@Test(groups= {"group 2nd"},priority=2)
	public void Test2()
	{
		System.out.println("Test2 in 2nd group with p2");
	}
	
	@Test(groups= {"group 1st","group 2nd"},priority=3)
	public void Test3()
	{
		System.out.println("Test3 in 1st & 2nd group with p3");
	}
	
	@Test(groups= "group 1st",priority=2)
	public void Test4()
	{
		System.out.println("Test4 in 1st group with p2");
	}


}
