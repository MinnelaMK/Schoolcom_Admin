package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Section_Assign_Incharge 
{
	static
	{
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	
	public void testcase()throws InterruptedException
	
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/new/#/login");
			driver.findElement(By.name("username")).sendKeys("salesdemo");
			driver.findElement(By.name("password")).sendKeys("salesdemo123");
			
			driver.findElement(By.xpath("//div/form/div[4]/button")).click();
			Thread.sleep(1000);
			driver.getTitle();
			System.out.print("Title of thr Page");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/div/div/span[2]/nb-icon")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-body/nb-select/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[3]/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
			
			//*[@id="cdk-overlay-8"]/nb-dialog-container/form/nb-card/nb-card-footer
	}



}
