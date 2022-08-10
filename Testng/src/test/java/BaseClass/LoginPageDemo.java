package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageDemo {
	
	WebDriver driver; 
	
	@BeforeClass//before all methods
	public void setup()
	{
		//it will generate report in xhtml file and show log in console if set 2nd argument as true
		//1st parameter [string] message it will display in console log if 2nd parameter is true[boolean]
				//class came from testng
				//customized log in same class itself
		Reporter.log("browser opened", true);//like sop in testng
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 Reporter.log("application opened", true);
	}
	
	@Test
	public void login()
	{
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selvamrajesh87@gamil");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("amuthaselvam87");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Reporter.log("clicked on aplicaiton", true);
	
		
	}

	@AfterClass //after all methods
	public void close()
	{
		driver.quit();
		//it will generate report in xhtml file and show log in console if set 2nd argument as true
		Reporter.log("browser closed", true);
	}
	
}
