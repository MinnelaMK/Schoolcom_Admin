package Class_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Student_Add_Page 
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
			
			
			//driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[16]/td[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/div/div/div/div/nb-layout-column/ngx-sections/div/div/nb-card/nb-card-body/table/tbody/tr/td[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div/button[2]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.id("name")).sendKeys("Test Minnela Auto");
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[2]/nb-accordion/nb-accordion-item[1]/nb-accordion-item-body/div/div/div[2]/nb-select/button")).click();
			Thread.sleep(500);
			driver.findElement(By.id("nb-option-0")).click();
			Thread.sleep(500);
			driver.findElement(By.id("admissionNo")).sendKeys("612");
			Thread.sleep(500);
			driver.findElement(By.id("rollNoInClass")).sendKeys("24");
			Thread.sleep(500);
			
			driver.findElement(By.id("mobile")).sendKeys("8886633380");
			Thread.sleep(500);
			driver.findElement(By.id("fatherName")).sendKeys("Jay");
			Thread.sleep(500);
			driver.findElement(By.id("motherName")).sendKeys("Raji");
			Thread.sleep(500);
			driver.findElement(By.id("mobile2")).sendKeys("7845912630");
			Thread.sleep(500);
			driver.findElement(By.id("email")).sendKeys("mkemail@gmail.com");
			Thread.sleep(500);
			driver.findElement(By.name("dateOfBirth")).sendKeys("Jan 6,1999");
			Thread.sleep(500);
			driver.findElement(By.id("address")).sendKeys("143 Tirupati Rural Near Tirupati");
			Thread.sleep(500);
			driver.findElement(By.id("pincode")).sendKeys("517143");
			Thread.sleep(500);
			driver.findElement(By.id("community")).sendKeys("Viswa Brahmin");
			Thread.sleep(500);
			driver.findElement(By.name("dateOfJoin")).sendKeys("Mar 16, 2023");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-new-student/form/nb-card/nb-card-body/div[2]/nb-accordion/nb-accordion-item[2]/nb-accordion-item-header")).click();
			Thread.sleep(500);
			
			
			
			driver.findElement(By.id("aadharNo")).sendKeys("777788889999");
			Thread.sleep(500);
			driver.findElement(By.id("bloodgroup")).sendKeys("O+");
			Thread.sleep(500);
			driver.findElement(By.id("emis")).sendKeys("5");
			Thread.sleep(500);
			driver.findElement(By.id("nationality")).sendKeys("Indian");
			Thread.sleep(500);
			driver.findElement(By.id("religion")).sendKeys("Hindhu");
			Thread.sleep(500);
			driver.findElement(By.id("caste")).sendKeys("BC");
			Thread.sleep(500);
			driver.findElement(By.id("standard_admitted")).sendKeys("Class Test");
			Thread.sleep(500);
			
			driver.findElement(By.id("previous_school")).sendKeys("NRI E M School");
			Thread.sleep(500);
			driver.findElement(By.id("personal_identification1")).sendKeys("Right Hand");
			Thread.sleep(500);
			driver.findElement(By.id("personal_identification2")).sendKeys("Left Hand");
			Thread.sleep(500);
			driver.findElement(By.id("area_name")).sendKeys("Venkatapathi Nagar");
			Thread.sleep(500);
			driver.findElement(By.id("stop_name")).sendKeys("S V Zoo Park");
			Thread.sleep(500);
			driver.findElement(By.id("gaurdian")).sendKeys("Krsih");
			Thread.sleep(500);
			
			driver.findElement(By.name("gaurdian_contact_no")).sendKeys("7845123690");
			Thread.sleep(500);
			driver.findElement(By.name("first_lang")).sendKeys("Telugu");
			Thread.sleep(500);
			driver.findElement(By.name("instruction_medium")).sendKeys("English");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
			Thread.sleep(500);
			
			
	}


}
