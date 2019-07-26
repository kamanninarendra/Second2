package testng;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class OhrmsFileUploadwithAutoIT {
	WebDriver driver;
	@Ignore
	public void takescreenshot(String str) throws Exception {
		DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");// declaration of date format
		Date d=new Date();// to update system date information
		String time=df.format(d);
		System.out.println(time);
		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // String dashboard=null;
		  Thread.sleep(2000);
		FileHandler.copy(f,new File("F:\\Weekend_Madhapur@June2019\\Mavenproject\\SCREENSHOTS\\"+str+time+".png"));
	}
	
  @Test(priority = 0)
  public void login() throws Exception {
	 // takescreenshot("login");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
  }
  
  @Test(priority = 1)
  public void fileupload() throws Exception {
	  driver.findElement(By.linkText("PIM")).click();
	  driver.findElement(By.xpath("//input[@name='btnAdd'][@value='Add']")).click();
	  driver.findElement(By.xpath("//input[@class='formInputText'][@name='firstName']")).sendKeys("apollo");
	  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("hospital");
	driver.findElement(By.xpath("//input[@name='employeeId'][@class='formInputText']")).clear();  
	driver.findElement(By.xpath("//input[@name='employeeId'][@class='formInputText']")).sendKeys("98768");
	driver.findElement(By.name("photofile")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec
	("D:\\E drive data 3-4-2019\\sel\\Projects\\Artifact\\src\\test\\java\\Maven\\Artifact\\fileupload.exe");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='btnSave'][@value='Save']")).click();
	//takescreenshot("fileupload");
  }
  
  @Test(priority = 2)
  public void logout() throws Exception {
	 
	  takescreenshot("logout");
	  driver.findElement(By.linkText("Welcome Admin")).click();
	  Thread.sleep(2000);
	  	  driver.findElement(By.linkText("Logout")).click();
  }
  @BeforeTest
  public void browser() {
//	  System.setProperty("webdriver.chrome.driver","F:\\SELENIUM SOFTWARES 2019\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver","D:\\E drive data 3-4-2019\\Tools\\sel\\BINARIES\\chromedriver_win32\\chromedriver.exe");

	  driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
