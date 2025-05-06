package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assign_Subject_Group 
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
			
			/*** Assig Subject Group ***/ 
			
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[2]/div/div/span[2]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("subjectgroups")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[2]/div[3]/div/nb-option-list/ul/nb-option[11]")).click();
			driver.findElement(By.id("subjectgroups")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			//*[@id="nb-option-22"]/nb-checkbox
			
			Thread.sleep(1000);
			driver.quit();
	}

}
