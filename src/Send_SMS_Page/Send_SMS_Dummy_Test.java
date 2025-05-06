package Send_SMS_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Engine.Source.Element;

public class Send_SMS_Dummy_Test 
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
	
		driver.findElement(By.xpath("//a[@title='Send SMS']")).click();
		Thread.sleep(1000);
						
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[1]/nb-select/button")).click();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[6]")).click();  /* Select Send to SMS Group */
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[2]/nb-select/button")).click();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[5]")).click(); /* Select the Template */
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[2]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(200);
		
		driver.findElement(By.id("groupName")).sendKeys("Targeyrene");
		Thread.sleep(200);
		
		WebElement Number = driver.findElement(By.xpath("//input[@type='number']"));
		Thread.sleep(200);
		Number.sendKeys("7894561230",Keys.ENTER );
		Thread.sleep(1000);
		
//		System.out.println("Submit started");
		driver.findElement(By.xpath("//div[2]/div[3]/div/nb-dialog-container/nb-card/nb-card-footer/div/button[1]")).click();
		Thread.sleep(200);
//		System.out.println("Submit ended");
		
		driver.findElement(By.xpath("//div[2]/div[5]/div[1]/nb-select/button")).click();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[2]/div/div/nb-option-list/ul/nb-option[10]")).click();
		Thread.sleep(200);
						
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[1]")).sendKeys("24-04-2024");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[2]")).sendKeys("9:30 AM");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[3]")).sendKeys("12:30 PM");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-sms/form/nb-card/nb-card-body/div[2]/div[6]/div/span[4]")).sendKeys("Princiap N R I School");
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
