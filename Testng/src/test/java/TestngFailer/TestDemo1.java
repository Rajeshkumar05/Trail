package TestngFailer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo1 {
	
	@Test
	public void fbTest()
	{
		Assert.assertTrue(false);
		System.out.println("Facebook working fine");
	}

}
