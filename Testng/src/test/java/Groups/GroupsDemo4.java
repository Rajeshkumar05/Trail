package Groups;

import org.testng.annotations.Test;
//class level grouping because class will have @Test
@Test(groups="a.1")
public class GroupsDemo4 {
	
	
	//belong to class level grouping
	public void Test1()
	{
		System.out.println("Test1 with class grouping a.1");
	}
	
	//belong to  both class level and method level grouping
	@Test(groups={"a.2"})
	public void Test2()
	{
		System.out.println("Test2 with both class a.1 and method grouping a.2");
	}

}
