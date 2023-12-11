package SeleniumJavaProject.SeleniumJava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 
{
	
     @BeforeSuite
     public void abc() 
     {
       System.out.println("Before suite");	 
     }
     
     @AfterSuite
     public void xyz() 
     {
       System.out.println("after suite");	 
     }
     
     
     @BeforeClass
     public void abcd() 
     {
       System.out.println("Before class");	 
     }
     
     @AfterClass
     public void xyzZ() 
     {
       System.out.println("after Class");	 
     }
     
     @BeforeMethod
     public void abcde() 
     {
       System.out.println("Before Method");	 
     }
     
     @AfterMethod
     public void xyzZy() 
     {
       System.out.println("after Method");	 
     }
     
     @BeforeTest
     public void abcdef() 
     {
       System.out.println("Before Test");	 
     }
     
     @AfterTest
     public void xyzZyZ() 
     {
       System.out.println("after Test");	 
     }
     
     @Test(priority=1)
     public void abcdefz() 
     {
       System.out.println("Test annotation");	 
     }
     
     @Test(priority=0)
     public void abcdefzU() 
     {
       System.out.println("Test2 annotation");	 
     }
     
}
