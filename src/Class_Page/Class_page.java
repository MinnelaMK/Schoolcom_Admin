package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_page 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	
	public void testcase()throws InterruptedException
	
	//public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/new/#/login");
			driver.findElement(By.name("username")).sendKeys("salesdemo");
			driver.findElement(By.name("password")).sendKeys("salesdemo123");
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(1000);
			driver.getTitle();
			System.out.print("title");
			driver.quit();
		
	}

}