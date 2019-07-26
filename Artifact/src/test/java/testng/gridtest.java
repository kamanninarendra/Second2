package testng;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import org.testng.annotations.*;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;

public class gridtest {
	WebDriver driver;
	
  @Test
  public void f() throws MalformedURLException, InterruptedException{
	  System.out.println("dd");
	    
		System.setProperty("webdriver.chrome.driver", "D:\\E drive data 3-4-2019\\Tools\\sel\\BINARIES\\chromedriver_win32\\chromedriver.exe");
	 	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\narendra.k\\Desktop\\ch2\\chromedriver.exe");
  		driver = new ChromeDriver();
  		driver.get("https://www.fb.com");

	 	//String baseUrl="https://opensource-demo.orangehrmlive.com";
		//String nodeUrl="http://10.0.26.150:4455/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome(); // browser capability intitialization
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN8_1);
		//cap.setVersion("75.0.3770.90");
		// capability.set
		// driver =new RemoteWebDriver(new URL(nodeUrl), capability);
		 driver=new RemoteWebDriver(new URL("http://192.168.43.168:4455/wd/hub"),cap);
		//  driver = new RemoteWebDriver("http://10.0.26.150:3333/wd/hub", DesiredCapabilities.chrome());
		// driver.get("http://www.google.com");
		 
		        Thread.sleep(3000);
    		 }
}
