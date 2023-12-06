package SeleniumJavaProject.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserPassword 
{
	@Test
  public void Useridnandpassword() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_114Version\\chromedriver.exe");  
	  ChromeDriver driver=new ChromeDriver(); 
	  driver.get("http:facebook.com");
	  Options op=driver.manage();
	  Window w=op.window();
	  w.maximize();
	  
	  WebElement emailaddress=driver.findElement(By.cssSelector("input#email"));
	  emailaddress.sendKeys("madankarvaishnav@yahoo.in");
	  
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("vaishnav@123");
	  
	  WebElement Submit=driver.findElement(By.name("login"));
	  Submit.click();;
	  
	  
	    
  }
  
  public static void main(String[] args) 
  {
	  UserPassword UP=new UserPassword();
	   UP.Useridnandpassword();
  }

}
