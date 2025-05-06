package Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Logout_SchoolCOM 
{
	static
	{
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	private WebDriver driver = new ChromeDriver();
	@Test
	
	public void test()throws InterruptedException
	
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/new/#/login");
			driver.findElement(By.name("username")).sendKeys("salesdemo");
			driver.findElement(By.name("password")).sendKeys("salesdemo123");
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(1000);
			
			
			
			System.out.println("Test 2 Maximize is Started");
			Thread.sleep(500);
			test2();
			
			
			
			
			
	}
	
	@Test
	public void test2()throws InterruptedException 
	{
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println("Test Maximize is Done");
		Thread.sleep(500);
		System.out.println("Test Logout is Started");
		Thread.sleep(1000);
		
		test3();
		
	}
	
	@Test
	public void test3() throws InterruptedException
	{
			
			driver.findElement(By.xpath("//div/div/nb-layout-header/nav/ngx-header/div[2]/nb-actions/nb-action[4]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li/a")).click();
			Thread.sleep(1000);
			
			System.out.println("Test Logout is Done");
			Thread.sleep(500);
			System.out.println("Quit is started");
			Thread.sleep(2000);
			driver.quit();

	}
}