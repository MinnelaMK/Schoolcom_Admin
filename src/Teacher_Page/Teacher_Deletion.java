package Teacher_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Teacher_Deletion 
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
		driver.findElement(By.xpath("//a[@title='Teachers']")).click();
		Thread.sleep(1000);
		
		for(int n=1; n<=5; n++)
		{
		
			if(n<6)
			{
				
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-body/table/tbody/tr[1]/td[4]/app-action-buttons/button")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-context-menu/nb-menu/ul/li[2]/a")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div/button[2]")).click();
				Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//div/div/nb-layout-header/nav/ngx-header/div[2]/nb-actions/nb-action[4]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li/a")).click();
				Thread.sleep(1000);
				
				
				
			}
			
			
		}
			
	}

}
