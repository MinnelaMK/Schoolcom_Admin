package Teacher_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Teacher_Edit 
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
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-faculty/div/div/nb-card/nb-card-body/table/tbody/tr[1]/td[4]/app-action-buttons/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[2]/div/div/nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(500);
			
			if(driver.findElement(By.id("name")).getAttribute("value").equalsIgnoreCase("Auto Teacher"))
				
			{
				driver.findElement(By.id("name")).clear();
				driver.findElement(By.id("name")).sendKeys("Auto Teacher Minnela");
				Thread.sleep(500);
				
				driver.findElement(By.id("mobile")).clear();
				driver.findElement(By.id("mobile")).sendKeys("9346464646");
				Thread.sleep(500);
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("mmkrishna@gmail.com");
				Thread.sleep(500);
				
				driver.findElement(By.name("dateOfjoin")).clear();
				driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 17, 2024");
				Thread.sleep(500);
				
				driver.findElement(By.name("dob")).clear();
				driver.findElement(By.name("dob")).sendKeys("Jan 24, 2022");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.name("qualification")).clear();
				driver.findElement(By.name("qualification")).sendKeys("Master of Science Electronics");
				Thread.sleep(500);
				
				driver.findElement(By.id("address")).clear();
				driver.findElement(By.id("address")).sendKeys("Tiruapti Rural Tirupati S V Zoo Park");
				Thread.sleep(500);
				
				driver.findElement(By.id("pincode")).clear();
				driver.findElement(By.id("pincode")).sendKeys("517517");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
				Thread.sleep(500);

			}
			
			else
			{
				driver.findElement(By.id("name")).clear();
				driver.findElement(By.id("name")).sendKeys("Auto Teacher");
				Thread.sleep(500);
				
				driver.findElement(By.id("mobile")).clear();
				driver.findElement(By.id("mobile")).sendKeys("9346464628");
				Thread.sleep(500);
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("mkrishna@gmail.com");
				Thread.sleep(500);
				
				driver.findElement(By.name("dateOfjoin")).clear();
				driver.findElement(By.name("dateOfjoin")).sendKeys("Mar 16, 2024");
				Thread.sleep(500);
				
				driver.findElement(By.name("dob")).clear();
				driver.findElement(By.name("dob")).sendKeys("Jan 6, 1999");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[2]/div[6]/nb-select/button")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.name("qualification")).clear();
				driver.findElement(By.name("qualification")).sendKeys("Master of Science");
				Thread.sleep(500);
				
				driver.findElement(By.id("address")).clear();
				driver.findElement(By.id("address")).sendKeys("Tiruapti Rural Tirupati S V Zoo Park");
				Thread.sleep(500);
				
				driver.findElement(By.id("pincode")).clear();
				driver.findElement(By.id("pincode")).sendKeys("517501");
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-add-teacher/form/nb-card/nb-card-body/div[3]/div/button[2]")).click();
				Thread.sleep(500);
	
			}
			
			
						
		}


}
