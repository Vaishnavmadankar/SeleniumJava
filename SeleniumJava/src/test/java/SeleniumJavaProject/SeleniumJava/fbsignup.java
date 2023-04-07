package SeleniumJavaProject.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fbsignup 
{
	@Test
  public void signuppage() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_111version\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		  driver.get("http:facebook.com");
		  Options op=driver.manage();
		  Window w=op.window();
		  w.maximize();
		  
		  WebElement button=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		  button.click();
		  Thread.sleep(5000);
		  WebElement firstname=driver.findElement(By.name("firstname"));
		  firstname.sendKeys("Vaishnav");
		  WebElement lastname=driver.findElement(By.name("lastname"));
		  lastname.sendKeys("madankar");
		  WebElement emailaddress=driver.findElement(By.name("reg_email__"));
		  emailaddress.sendKeys("abc@fb.com");
		  WebElement Reenteremailaddress=driver.findElement(By.name("reg_email_confirmation__"));
		  Reenteremailaddress.sendKeys("abc@fb.com");
		  WebElement Newpassword=driver.findElement(By.name("reg_passwd__"));
		  Newpassword.sendKeys("fb@123456");  
		  WebElement days=driver.findElement(By.id("day"));
		  Select s=new Select(days);
		  s.selectByIndex(7);
		  WebElement months=driver.findElement(By.id("month"));
		  Select SP=new Select(months);
		  SP.selectByValue("5");
		  WebElement years=driver.findElement(By.id("year"));
		  Select SO=new Select(years);
		  SO.selectByVisibleText("1996");
		  WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));
		  Thread.sleep(1000);
		  gender.click();
		  WebElement Submit=driver.findElement(By.name("websubmit"));
		  Thread.sleep(1000);
		  Submit.click();
  }
  
  public static void main(String[] args) throws InterruptedException 
  {
	  fbsignup FB=new fbsignup();
	  FB.signuppage();
  }
}
