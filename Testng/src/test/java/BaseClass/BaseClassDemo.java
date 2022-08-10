package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClassDemo {

WebDriver driver; 
	
	@BeforeClass// before all methods in class
	public void setup()
	{
		//it will generate report in xhtml file and show log in console if set 2nd parameter as true
		//1st parameter [string] message it will display in console log if 2nd parameter is true[boolean]
		//class
		//customized log in same class
		Reporter.log("browser opened", true);//like sop in testng
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 Reporter.log("application opened", true);
	}
	
	
	
	@AfterClass// after all methods in class
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
		//it will generate report in xhtml file and show log in console if set 2nd argument as true
		Reporter.log("browser closed", true);
	}
}
