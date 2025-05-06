package Subject_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Subject_Edit_popup 
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
			
			driver.findElement(By.xpath("//a[@title='Subjects']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[20]/td[2]/app-action-buttons/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(500);
			
	}

}
