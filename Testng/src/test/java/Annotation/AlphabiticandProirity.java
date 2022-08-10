package Annotation;

import org.testng.annotations.Test;

@Test
public class AlphabiticandProirity {
	//both methods have same priority then work based on alphabetic order[default]
	
	@Test(priority=1)
	public void bStrating()
	{
		System.out.println("b staring");
	}
	
	@Test(priority=1)
	public void aStrating()
	{
		System.out.println("a staring");
	}

}
