package Testngpack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	//soft assert
	@Test
	public void softAssert()
	{
		
		SoftAssert soft=new SoftAssert();//SoftAssert-->class
		System.out.println("soft test started");
		soft.assertTrue(false);
		soft.assertEquals(12, 13,"count1 is mismatch");
		//will display
		System.out.println("soft comparation1 completed");
		
		
		
		//soft.assertEquals(22, 33,"count2 is mismatch");
		//will display
		System.out.println("soft comparation2 completed");
		
		//it contains all the assert information of above assert
		//"that assertAll() line is failure point"  so only soft assert executing fully
       //if we keep in middle then sop after it wont be display so asking to keep as last statement
		soft.assertAll();//keep as last statement[manditory]
		
		 
	}
	
	
	//hard assert
	/*
	 * @Test public void hardAssert() { System.out.println("hard test started");
	 *
	 * Assert.assertEquals(12, 13); //never display and "that particular validation line is failure point"
	 * System.out.println("hard test completed");
	 * 
	 * }
	 */
	 

}
