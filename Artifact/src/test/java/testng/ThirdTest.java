package testng;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class ThirdTest {
	
	 public void method(String S) {
		 System.out.println("hi");
	 }
		

	@Test(priority = 0)
  public void f1() {
		method("selenium");
		
	  }

}
