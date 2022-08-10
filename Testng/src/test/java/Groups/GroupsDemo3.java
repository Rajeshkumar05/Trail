package Groups;

import org.testng.annotations.Test;

public class GroupsDemo3 {
	
	//groups of groups[metagroups]
	@Test(groups={"a.1"})
	public void Test1()
	{
		System.out.println("Test1 in a.1");
	}
	
	@Test(groups={"a.2"})
	public void Test2()
	{
		System.out.println("Test2 in a.2");
	}
	
	@Test(groups={"a.3"})
	public void Test3()
	{
		System.out.println("Test3 in a.3");
	}
	
	@Test(groups={"qa.4"})
	public void Test4()
	{
		System.out.println("Test4 in qa.4");
	}


}
