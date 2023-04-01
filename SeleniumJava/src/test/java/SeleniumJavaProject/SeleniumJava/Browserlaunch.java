package SeleniumJavaProject.SeleniumJava;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch 
{
  public void handlebrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver_111version\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver(); 
	  driver.get("http:facebook.com");
	  Options op=driver.manage();
	  Window w=op.window();
	  w.maximize();
  }
  
  public static void main(String[] args) 
  {
	Browserlaunch browser=new Browserlaunch();
	browser.handlebrowser();
  }
}
