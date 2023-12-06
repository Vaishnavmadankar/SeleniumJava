package SeleniumJavaProject.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathsP1 
{
	@Test
   public void lunchone() 
   {
	   System.setProperty("webdrive.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Options W=driver.manage();
	   Window S=W.window();
	   S.maximize();
	   
	   WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	   username.sendKeys("vipinpatil00@gmail.com");
	   WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
	   Password.sendKeys("Vipin@185");
	   
	   WebElement Submit=driver.findElement(By.xpath("//button[@name='login']"));
	   Submit.click();
   }
   
   public static void main(String[] args) {
	XpathsP1 P1=new XpathsP1();
	P1.lunchone();
	
}
}
