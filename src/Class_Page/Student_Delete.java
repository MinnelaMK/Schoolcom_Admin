package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Student_Delete 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	private WebDriver driver = new ChromeDriver();
	
		@BeforeClass
		
		public void openBrowser() throws InterruptedException
		{
			Reporter.log("openBrowser",true);
			driver.get("http://tabdev.schoolcom.in/new/#/login");
			Thread.sleep(1000);
		}
		@AfterClass
				
			public void closeBrowser() throws InterruptedException
			{
				Reporter.log("closeBrowser",true);
				driver.close();
			}
			
		@BeforeMethod
		
			public void login() throws InterruptedException
			{
				Reporter.log("login",true);
				driver.findElement(By.name("username")).sendKeys("salesdemo");
				driver.findElement(By.name("password")).sendKeys("salesdemo123");
				Thread.sleep(500);
				driver.findElement(By.xpath("//div/form/div[4]/button")).click();
				Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(500);
				
			}
			
		@AfterMethod
		
			public void logout() throws InterruptedException
			{
			
				Reporter.log("log out",true);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div/div/nb-layout-header/nav/ngx-header/div[2]/nb-actions/nb-action[4]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li/a")).click();
				Thread.sleep(1000);
				
			}
		
		@Test(priority=1,invocationCount=1)
		
			public void editCustomer()throws InterruptedException 
			{
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[1]")).click();
			Thread.sleep(2000);
			
			
				for(int n=1; n<=5; n++)
				{
				
					if(n<6)
					{
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-students/div/div/nb-card/nb-card-body/table/tbody/tr[1]/td[2]/app-action-buttons/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//div[2]/div[2]/div/nb-dialog-container/ngx-confirm-dialog/nb-card/nb-card-footer/div/button[2]")).click();
						Thread.sleep(500);
				
					}
					else
					{
						
						System.out.println("If is Not Working");
						
					}
				}
			
			
				
			}



}
