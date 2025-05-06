package Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Credentails 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chormedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/new/#/login");
		driver.findElement(By.name("email")).sendKeys("salesdemo");
		driver.findElement(By.name("password")).sendKeys("salesdemo123");
		
		driver.findElement(By.xpath("//div/form/div[4]/button")).click();
		Thread.sleep(1000);
		
		
	}

}
