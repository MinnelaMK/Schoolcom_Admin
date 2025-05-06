package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Student_Edit_Page 
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
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(1000);
			
			
			//driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-students/div/div/nb-card/nb-card-body/table/tbody/tr[1]/td[2]/app-action-buttons/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//nb-dialog-container/ngx-confirm-dialog/nb-card/nb-card-footer/div/button[2]")).click();
			Thread.sleep(500);
	}

}
