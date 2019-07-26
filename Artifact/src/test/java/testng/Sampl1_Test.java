package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sampl1_Test {
  @Test
  public void f() {
	  System.out.println("Ttest1Narendr");
  }
  @Test(groups="flower")
  public void flower() {
	  System.out.println("rose");
	  /*WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "D:\\E drive data 3-4-2019\\Tools\\sel\\BINARIES\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();*/
	  
  }
  @Test(groups="fruit")
public void test() {
	  System.out.println("mango");
  }
  @Test(groups="fruit")
public void test2() {
	  System.out.println("banana");
  }
  @Test(groups="flower")
public void test3() {
	  System.out.println("Rose2");
  }
  @Test(groups="automobile")
public void test4() {
	  System.out.println("Car");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Ttest1Narendr1");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Ttest1Narendr2");

  }

}
