package TestngFailer;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRunner {
	
	//public static void main(String arg[])
	
	@Test
	public void test11()
	{
		
		
		//1)adding our suite in list as string
		List<String> list=new ArrayList<String>();
		//we need mention from base folder not from sub-folder
		list.add("./test-output/smookesuite/testng-failed.xml");
		
		//2)TestNG-->class
				TestNG obj=new TestNG();
		
		//giving added list as parameter
		//3)1st set it before run
		obj.setTestSuites(list);
		
		//will run our mentioned suite
		//4)next run it
		obj.run();
	}
	

}
