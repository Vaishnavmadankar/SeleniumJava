package SeleniumJavaProject.SeleniumJava;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipletab 
{
ChromeDriver driver;
	
	@Before
	public void launchyoutube() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:youtube.com");
		Options w=driver.manage();
		Window s=w.window();
		s.maximize();
	
	}
	
	@Test
	public void youtube() throws InterruptedException 
	{
		WebElement youtube=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
	    for (int i = 0; i <=5; i++) 
	    {
		    ac.sendKeys(Keys.TAB).perform();
		    Thread.sleep(2000);
		}
	    
	}
	

}
