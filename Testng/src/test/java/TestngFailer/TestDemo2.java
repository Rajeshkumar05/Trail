package TestngFailer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2 {
	
	@Test
	public void twitterTest()
	{
		Assert.assertTrue(false);
		System.out.println("twitter working fine");
	}

}
