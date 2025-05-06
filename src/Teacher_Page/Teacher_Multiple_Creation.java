package Teacher_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Teacher_Multiple_Creation 
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
				
				driver.findElement(By.xpath("//a[@title='Teachers']")).click();
				Thread.sleep(1000);
				
				
				
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
				System.out.println("Test 2 Maximize is Started");
				Thread.sleep(500);
				
				Mk();
				
			}
				
			
		
		public void Mk() throws InterruptedException
		{
				for(int n=1; n<=5; n++)
					
				{
					System.out.println("Automatio on Loop"+ n);
					Thread.sleep(2000);
					switch(n)
					{
					case 1:
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-header/div/button")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("name")).sendKeys("Auto Teacher MK");
						Thread.sleep(500);
						
						driver.findElement(By.id("mobile")).sendKeys("9346464646");
						Thread.sleep(500);
						
						driver.findElement(By.id("email")).sendKeys("minnelamkkrishna@gmail.com");
						Thread.sleep(500);
						
						driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 16, 2021");
						Thread.sleep(500);
						
						driver.findElement(By.name("dob")).sendKeys("Dec 12, 1998");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[2]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.name("qualification")).sendKeys("Master of Science");
						Thread.sleep(500);
						
						driver.findElement(By.id("address")).sendKeys("Putta Parthi Bukhapatnam");
						Thread.sleep(500);
						
						driver.findElement(By.id("pincode")).sendKeys("507143");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
						Thread.sleep(500);
						
						break;
					
					case 2:
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-header/div/button")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("name")).sendKeys("Auto MK");
						Thread.sleep(500);
						
						driver.findElement(By.id("mobile")).sendKeys("9303464646");
						Thread.sleep(500);
						
						driver.findElement(By.id("email")).sendKeys("minnelamkrishna@gmail.com");
						Thread.sleep(500);
						
						driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 26, 2021");
						Thread.sleep(500);
						
						driver.findElement(By.name("dob")).sendKeys("Sep 6, 1999");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[2]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.name("qualification")).sendKeys("BSC Pharmacy");
						Thread.sleep(500);
						
						driver.findElement(By.id("address")).sendKeys("Venkatapathi Nagar");
						Thread.sleep(500);
						
						driver.findElement(By.id("pincode")).sendKeys("507507");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
						Thread.sleep(500);
						
						break;
						
					case 3:
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-header/div/button")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("name")).sendKeys("Auto Krishna");
						Thread.sleep(500);
						
						driver.findElement(By.id("mobile")).sendKeys("9336464646");
						Thread.sleep(500);
						
						driver.findElement(By.id("email")).sendKeys("minnelamkkrishna@gmail.com");
						Thread.sleep(500);
						
						driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 6, 2021");
						Thread.sleep(500);
						
						driver.findElement(By.name("dob")).sendKeys("Oct 6, 1998");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[2]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.name("qualification")).sendKeys("MCA");
						Thread.sleep(500);
						
						driver.findElement(By.id("address")).sendKeys("Mangalam");
						Thread.sleep(500);
						
						driver.findElement(By.id("pincode")).sendKeys("517501");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
						Thread.sleep(500);
						
						break;
					
					case 4:
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-header/div/button")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("name")).sendKeys("Auto Murali");
						Thread.sleep(500);
						
						driver.findElement(By.id("mobile")).sendKeys("9346403646");
						Thread.sleep(500);
						
						driver.findElement(By.id("email")).sendKeys("krishna@gmail.com");
						Thread.sleep(500);
						
						driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 1, 2021");
						Thread.sleep(500);
						
						driver.findElement(By.name("dob")).sendKeys("Feb 6, 2010");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[2]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.name("qualification")).sendKeys("8th Class");
						Thread.sleep(500);
						
						driver.findElement(By.id("address")).sendKeys("Kothapeta");
						Thread.sleep(500);
						
						driver.findElement(By.id("pincode")).sendKeys("507508");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
						Thread.sleep(500);
						
						break;
					
					case 5:
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-header/div/button")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("name")).sendKeys("Auto Minnela");
						Thread.sleep(500);
						
						driver.findElement(By.id("mobile")).sendKeys("9033646464");
						Thread.sleep(500);
						
						driver.findElement(By.id("email")).sendKeys("minnelakrishna@gmail.com");
						Thread.sleep(500);
						
						driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 11, 2021");
						Thread.sleep(500);
						
						driver.findElement(By.name("dob")).sendKeys("Jan 24, 1998");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
						Thread.sleep(500);
						
						driver.findElement(By.name("qualification")).sendKeys("Master of Science");
						Thread.sleep(500);
						
						driver.findElement(By.id("address")).sendKeys("Chandragiri");
						Thread.sleep(500);
						
						driver.findElement(By.id("pincode")).sendKeys("517510");
						Thread.sleep(500);
						
						driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
						Thread.sleep(500);
					
					break;
						
					default:
						
						driver.findElement(By.xpath("//div/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[1]")).click();
						Thread.sleep(1000);
					
					}
				}
					
				
			}


}
