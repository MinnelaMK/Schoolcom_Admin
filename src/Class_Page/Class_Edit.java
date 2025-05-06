package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_Edit 
{
	static
	{
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void test1()
	{
		System.out.println("Schoolcom Automation test Started");
	}
	private WebDriver driver = new ChromeDriver();
	@Test
	
	public void test()throws InterruptedException
	
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/new/#/login");
			driver.findElement(By.name("username")).sendKeys("salesdemo");
			driver.findElement(By.name("password")).sendKeys("salesdemo123");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[4]/app-action-buttons/button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("className")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.id("className")).sendKeys("Class Automation");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
			
			driver.quit();
	}
}
