package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//same code repeated==>code duplication
//extends ==>link base class things vissible in child class
public class InvalidLoginPageDemo extends BaseClassDemo {
	
	
	
	
	//description()==>will return String[]
	@Test(description ="test1")
	public void login()
	{
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selvamrajesh87@gamil1");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("amuthaselvam8711");
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Reporter.log("clicked on aplicaiton", true);
		
	}
	
	
	@Test(description ="test2")
	public void login1()
	{
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selvamrajesh87@gamil2");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("amuthaselvam872");
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Reporter.log("clicked on aplicaiton", true);
		
	}

	
}
