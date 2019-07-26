package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample2_Test {


@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	 System.out.println("After method2 nare");
  }
  @BeforeMethod
  public void beforeMethod(String myname22) {
  System.out.println("Before method2 nare");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method2 nare");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  
  }

  @AfterTest
  public void afterTest() {
	 System.out.println("After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before test suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After test suite");
  }
  
  @Test(priority = 1)
  public  void  method(String myname) {
	  String myname1="reddy"; 
	  System.out.println("narendra2 is "+  myname1);
	 
  }

  
  @Test(priority=0,enabled=false)
  public void method1() {
	  System.out.println("narendra");
  }

}
