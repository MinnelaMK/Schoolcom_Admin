package Subject_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Subject_Add_Subject_Partition 
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
			
			driver.findElement(By.xpath("//a[@title='Subjects']")).click();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-subjects/div/div/nb-card/nb-card-header/div/button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("subjectName")).sendKeys("Test Automation");
			Thread.sleep(500);
			
			/*   Partition */
			
			driver.findElement(By.xpath("//div/div[1]/div[2]/nb-toggle/label")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/div[3]/div[13]")).click();
			Thread.sleep(500);
	
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(500);
	}
}
