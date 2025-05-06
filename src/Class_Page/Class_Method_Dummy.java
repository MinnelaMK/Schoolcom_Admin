package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_Method_Dummy 
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
		
		driver.get("http://tabdev.schoolcom.in/new/#/login");
			driver.findElement(By.name("username")).sendKeys("salesdemo");
			driver.findElement(By.name("password")).sendKeys("salesdemo123");
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(1000);
			
			/* Create Class */
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("className")).sendKeys("Test Automation Class");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
			
			test2();
			Thread.sleep(1000);
			
			System.out.println("Test 2 tested");
			Thread.sleep(500);
			
			driver.quit();
			
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		/* Assign Subject Group */
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[2]/div/div/span[2]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("subjectgroups")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[2]/div[4]/div/nb-option-list/ul/nb-option[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[4]/div/nb-option-list/ul/nb-option[11]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("subjectgroups")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div/button[2]")).click();
		Thread.sleep(1000);

	}
}
