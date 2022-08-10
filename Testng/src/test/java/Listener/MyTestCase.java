package Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//using the class file where  listener methods are implemented
//class level listener
@Listeners(Listener.ListenerDemo.class)
public class MyTestCase {
	
	//@Test
	public void title()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void worst()
	{
		//forcefully failing
		Assert.assertTrue(false,"i am failed");//java.lang.AssertionError: expected [true] but found [false]
	    
	}

}
