package Send_SMS_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Send_SMS_Teachers 
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
				driver.quit();
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
				//driver.manage().window().maximize();
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
		
		public void SMSstudent()throws InterruptedException 
		{
			driver.findElement(By.xpath("//a[@title='Send SMS']")).click();
			Thread.sleep(1000);
							
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[1]/nb-select/button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("nb-option-1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[2]/nb-select/button")).click();
			Thread.sleep(200);
			
			driver.findElement(By.id("nb-option-11")).click();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[3]/nb-select/button")).click();
			Thread.sleep(200);
			
			driver.findElement(By.id("nb-option-106")).click();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[3]/nb-select/button")).click();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/div/span[1]")).sendKeys("24-04-2024");
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/div/span[2]")).sendKeys("4th Block");
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/div/span[3]")).sendKeys("N R I English Medium School");
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/div/span[4]")).sendKeys("Princiap N R I School");
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[7]/nb-select/button")).click();
			Thread.sleep(200);
			
			driver.findElement(By.id("nb-option-6")).click();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[7]/nb-select/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[3]/button[2]")).click();
			Thread.sleep(1000);
		}

		@Test(priority=2,description = "SMS to Teachers")
		
			public void SMSTeacher()throws InterruptedException 
			{
				
				driver.findElement(By.xpath("//a[@title='Send SMS']")).click();
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[1]/nb-select/button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[5]")).click();  /* Select Send to Teachers */
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[2]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[5]")).click(); /* Select the Template */
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[3]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[2]")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[3]")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[4]")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/nb-select/button")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[5]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[1]")).sendKeys("24-04-2024");
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[2]")).sendKeys("9:30 AM");
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[3]")).sendKeys("12:30 PM");
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[4]")).sendKeys("Princiap N R I School");
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[5]")).sendKeys("SchoolCOM Tester");
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[8]/nb-select/button")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
				Thread.sleep(200);
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[3]")).click();
				Thread.sleep(200);
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[4]")).click();
				Thread.sleep(200);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[8]/nb-select/button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[3]/button[2]")).click();
				Thread.sleep(1000);
	
			}


}
