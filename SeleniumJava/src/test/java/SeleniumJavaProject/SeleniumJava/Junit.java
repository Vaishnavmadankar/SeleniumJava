package SeleniumJavaProject.SeleniumJava;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Junit 
{
	
	ChromeDriver driver;
	
	@Test
	@Before
	public void launchfb() 
	{
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_119Version\\chromedriver-win64\\chromedriver.exe");	
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  Options W=driver.manage();
	  Window S=W.window();
	  S.maximize();
	  
	}
	
	@org.junit.Test
    public void signup() throws InterruptedException 
    {
        WebElement Signupurl=driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
  	    Signupurl.click();
        WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        Firstname.sendKeys("Vaishnav");
        WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        Lastname.sendKeys("Madankar");
        WebElement EmailAddress=driver.findElement(By.xpath("//input[contains(@id,'u_0_g_')]"));
        EmailAddress.sendKeys("vaishnav.madankar@gmail.com");
        WebElement reEmailAddress=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEmailAddress.sendKeys("vaishnav.madankar@gmail.com");
        WebElement Passwordset =driver.findElement(By.xpath("//input[@id='password_step_input']"));
        Passwordset.sendKeys("Abc@1928");
        WebElement Birthday =driver.findElement(By.xpath("//select[@id='day']"));
        Birthday.sendKeys("25");
        WebElement Birthmonth =driver.findElement(By.xpath("//select[@id='month']"));
        Birthmonth.sendKeys("11");
        WebElement Birthyears =driver.findElement(By.xpath("//select[@id='year']"));
        Birthyears.sendKeys("1995");
        WebElement Gender=driver.findElement(By.xpath("//label[contains(@for,'u_0_4_')]"));
        Gender.click();
        WebElement Submitsignup=driver.findElement(By.xpath("//button[@name='websubmit']"));
        Submitsignup.click();
        Thread.sleep(5000);
    }
    
	@After
    public void close()
    {
		driver.get("https://www.facebook.com/login/");
        driver.close();
    	
    }
    


}
