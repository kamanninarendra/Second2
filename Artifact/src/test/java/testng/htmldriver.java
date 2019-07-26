package testng;

import java.util.Set;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class htmldriver {
  @Test
  public void f() {
	 // WebDriver driver;
	  HtmlUnitDriver driver=new HtmlUnitDriver();	
          driver.get("https://www.naukri.com");
     String s=       driver.getTitle();
          System.out.println("tileis" +s);
      String s1=driver.getCurrentUrl();
          System.out.println("tileis" +s1);
          String s3=driver.getCurrentUrl();
          System.out.println("tileis" +s1);
           String S4=driver.getWindowHandle();
    		      System.out.println("tileis" +S4);
           // set <String>  S5=driver.getWindowHandles() ;
            Set<String> allwindows=driver.getWindowHandles();
            System.out.println("tileis" +allwindows);
            //String s6=driver.getPageSource();
            //System.out.println("tileis" +s6);
          // list <String> allwindowss7=driver.getCapabilities();
            		
    		      // Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
   	  //Assert.assert
          

  }
}
