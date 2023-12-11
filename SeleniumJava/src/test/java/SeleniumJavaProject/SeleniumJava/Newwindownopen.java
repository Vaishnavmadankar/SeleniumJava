package SeleniumJavaProject.SeleniumJava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newwindownopen 
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
	public void youtube() 
	{
		WebElement youtube=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(youtube).keyUp(Keys.CONTROL).build().perform();
	    
	}
	
	

}
