package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Ignore;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
public class grid {

	@Test(priority=1)
		public void setup () throws MalformedURLException, InterruptedException
		  {
		String baseUrl,nodeUrl;
		WebDriver driver;
			// System.setProperty("webdriver.chrome.driver", "D:\\E drive data 3-4-2019\\Tools\\sel\\BINARIES\\chromedriver_win32\\chromedriver.exe");
		 //driver =new ChromeDriver();
	           System.out.println("test1");
			 baseUrl="http://www.newtours.demoaut.com/";
			 nodeUrl="http://10.0.26.150:5566/wd/hub";
			 
			 DesiredCapabilities capability = DesiredCapabilities.chrome(); // browser capability initialization
			 capability.setBrowserName("chrome"); // browser name setup
			// capability.setVersion("75.0.3770.100"); // browser name setup
			
			 capability.setPlatform(Platform.VISTA); // operating system initialization
			 driver=new RemoteWebDriver(new URL(nodeUrl),capability);
			// driver =new RemoteWebDriver(new URL(nodeUrl),capability);
			           Thread.sleep(2000);
				// TODO Auto-generated catch block
			
			
			 }
}

/*
		public static void main(String[] args) throws Exception, Exception {
			// TODO Auto-generated method stub
			Seleniumgridexmaple s=new Seleniumgridexmaple();
			s.setup();
			s.simpletest();
		}
		}*/

  

