package Project_Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homepage {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","F://Complete_Project_Test//COM.QA.CompleteProjectFlow//src//test//resources//chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	public void launchbrowser()
	{
		
		driver.get("http://www.google.com");
		System.out.println("Url opened");
	}
	
	@Test
	public void verifyurl()
	{
		String url=driver.getCurrentUrl();
		System.out.println("Current url is "+ url);
		//Assert.assertEquals(url,"http://www.google.com");
	}
	@Test
	public void verifyTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title of the url is "+title);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
