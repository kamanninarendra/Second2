package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class junit_testcase2 {
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test3");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test33");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Test3w3");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test3322");
	}

	@Test
	public void test1() {
		fail("Not yet implemented1");
	}
   
	@Test
	public void test2() {
    	System.out.println("Not yet implemented2");
	}

	@Test
	public void test3() {
		System.out.println("Not yet implemented");
	}
}
