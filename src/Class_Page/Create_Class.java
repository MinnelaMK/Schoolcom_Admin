package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Create_Class 
{

		static 
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		
		@Test
		
		public void testcase()throws InterruptedException
		
		
		{
			WebDriver driver = new ChromeDriver();
			driver.get("http://tabdev.schoolcom.in/new/#/login");
				driver.findElement(By.name("username")).sendKeys("salesdemo");
				driver.findElement(By.name("password")).sendKeys("salesdemo123");
				
				driver.findElement(By.xpath("//div/form/div[4]/button")).click();
				Thread.sleep(1000);
				driver.getTitle();
				System.out.print("Title of thr Page");
				
				driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
				Thread.sleep(500);
				
				driver.findElement(By.id("className")).sendKeys("Test Automation Class");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div/button[2]")).click();
		
	}
		
}
