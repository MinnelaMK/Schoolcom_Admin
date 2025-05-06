package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Section_Clickon_Save_in_Assignsubjectteacher 
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
			
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[2]/div/div/span[2]/nb-icon")).click();
			Thread.sleep(500);
			
			/**** English ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[1]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[7]")).click();
			Thread.sleep(500);
			
			/**** Tamil ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[2]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[1]")).click();
			Thread.sleep(500);
			
			/**** Maths ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[3]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[10]")).click();
			Thread.sleep(500);
			
			/**** Science ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[4]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[5]")).click();
			Thread.sleep(500);
			
			/**** Social ****/
			driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[5]/td[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[17]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[2]/div[3]/button[2]")).click();
			Thread.sleep(1000);
			
			driver.quit();
	}


}
