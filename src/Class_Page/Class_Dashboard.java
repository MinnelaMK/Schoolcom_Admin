package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_Dashboard

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
			driver.getTitle();
			System.out.println("Title of thr Page");
			
			/* Create Class */
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("className")).sendKeys("Test Automation Class");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
			
			/* Assign Subject Group */
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[2]/div/div/span[2]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("subjectgroups")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[2]/div[4]/div/nb-option-list/ul/nb-option[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[4]/div/nb-option-list/ul/nb-option[11]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("subjectgroups")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(1000);
			
			/** Section Creation **/
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-header/div/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("sectionName")).sendKeys("Test Section Auto");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
	
			/* Assign Incharge */
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/div/div/span[2]/nb-icon")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-body/nb-select/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[4]/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
			
			/* Assign Subject teachers */
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[2]/div/div/span[2]/nb-icon")).click();
			Thread.sleep(500);
			
			/**** English ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[1]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);
			
			/**** Tamil ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[2]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);
			
			/**** Maths ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[3]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);
			
			/**** Science ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[4]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);
			
			/**** Social ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[5]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);

			driver.findElement(By.xpath("//div[2]/div[3]/button[2]")).click();
			Thread.sleep(500);
			
			/** Edit Section **/
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[4]/app-action-buttons/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(500);
			driver.findElement(By.id("sectionName")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("sectionName")).sendKeys("Auto Section");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(500);
			
			/* Delete Section */
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[4]/app-action-buttons/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(500);
			
			/* Back to Class Page */
			driver.navigate().back();
			Thread.sleep(1000);
			/* Class Edited */
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[4]/app-action-buttons/button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("className")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.id("className")).sendKeys("Class Automation");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(2000);
			
			test3();
			Thread.sleep(2000);
			
			driver.close();
	}

	@Test
	public void test3()throws InterruptedException
	{
		
			/* Class Deleted */
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[6]/td[4]/app-action-buttons")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(1000);
					
			
	}


}
