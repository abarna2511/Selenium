package testngassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test
	public void test1() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test1 started");
		int a = 10;
		int b = 20;
		assertion.assertEquals(a, b);
		System.out.println("Test1 Completed");
		assertion.assertAll();
	}

	
	@Test
	public void test2() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test2 started");
		String a = "Vignesh";
		assertion.assertEquals(a, "Vignesh");
		System.out.println("Test2 Completed");
		assertion.assertAll();
	}
}
