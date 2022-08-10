package Testngpack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void start()
	{
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\raselvam\\Downloads\\selenium\\geckodriver.exe");
			 driver = new FirefoxDriver();
		System.out.println("Browser started");
	}
	
	@Test
	public void startApp()
	{
		
		driver.get("https://en-gb.facebook.com/");
		String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("face"));
	System.out.println("page loaded");
		
	}
	
	@Test(dependsOnMethods="startApp")
	public void logIn()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selvamrajesh87@gamil");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("amuthaselvam87");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		//isEnabled()==>visibile
		/*
		 * boolean
		 * status=driver.findElement(By.xpath("//span[contains(text(),'Friends')]")).
		 * isEnabled(); Assert.assertTrue(status);
		 */
		System.out.println("page login");
		
	}
	
	//will skip the dependent cases
	/*
	 * @Test(dependsOnMethods="logIn") public void logOut() {
	 * driver.findElement(By.xpath("//div[@aria-label=''Account]")).click();
	 * driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	 * Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Log In']")).
	 * isEnabled()); System.out.println("page logout"); }
	 */
	
	@AfterClass
	public void end()
	{
		driver.quit();
		System.out.println("browser closed");
	}

}
