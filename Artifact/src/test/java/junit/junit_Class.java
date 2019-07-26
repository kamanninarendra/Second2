/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author narendra.k
 *
 */
public class junit_Class {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hi");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Hi1111");
		


	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Narendra");
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Test");

	}
	@Test
	public void test2() {
//		fail("Not yet implemented");
		System.out.println("Test2");

	}


}

