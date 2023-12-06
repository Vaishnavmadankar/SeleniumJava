package SeleniumJavaProject.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class myntralaunch 
{
@Test
	public void myntracode() throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.nykaa.com");
	 Options W=driver.manage();
	 Window S=W.window();
	 S.maximize();
	 
	 WebElement Signup=driver.findElement(By.cssSelector("button[class='css-1gzc5zn']"));
	 Signup.click();
	 Thread.sleep(5000);
	 WebElement Selectemail=driver.findElement(By.cssSelector("button[class='css-65och3']"));
     Selectemail.click();
     Thread.sleep(1000);
     WebElement Emailentered=driver.findElement(By.name("emailMobile"));
     Emailentered.sendKeys("9156614005");
     
     WebElement Submit=driver.findElement(By.cssSelector("button[type='submit']"));
     Submit.click();
     
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	myntralaunch my=new myntralaunch();
	my.myntracode();
	}
	
	
}
