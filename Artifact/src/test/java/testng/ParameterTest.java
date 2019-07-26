package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ParameterTest {
  @Test
 	  public void test() {
	  //str="narendra";
	  // TODO Auto-generated catch block
	
	     String a = "narendradd";
	      System.out.println("Parameterized value is "+  a);

  }
 

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
