package Subject_Group_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SubjectGrou_Dummytest 
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
			
			driver.findElement(By.xpath("//a[@title='Subject Groups']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[24]/td[3]/app-action-buttons/button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(1000);
			
			
				System.out.println("Start Delete");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-footer/div/button[1]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[24]/td[3]/app-action-buttons/button")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div/button[2]")).click();
				Thread.sleep(1000);
			
				
			}
	

}
