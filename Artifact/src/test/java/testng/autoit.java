package testng;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoit {
  @Test
  public void f() throws IOException, Exception {
	  
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D:\\E drive data 3-4-2019\\Tools\\sel\\BINARIES\\chromedriver_win32\\chromedriver.exe");
  	// driver.manage().window().maximize();
  	driver=new ChromeDriver();
  	driver.manage().window().maximize();
	driver.get("http://tinypic.com");
	driver.findElement(By.xpath("//input[@id='the_file']")).click();;
      // Alert alert;
      // Alert alert = driver.switchTo().alert();

       //System.out.println(alert.getText());

      // alert.accept();
	//alert.accept();
        Thread.sleep(2000);
			Runtime.getRuntime().exec("D:\\E drive data 3-4-2019\\sel\\Projects\\Artifact\\src\\test\\java\\Maven\\Artifact\\fileupload1.exe");
			//CharSequence ;
	        Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='description']")).sendKeys("dadf");
	        Thread.sleep(2000);

			// TODO Auto-generated catch block
  }
		
}
