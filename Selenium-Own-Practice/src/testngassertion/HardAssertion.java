package testngassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void test1() {
		System.out.println("Test1 started");
		int a = 20;
		int b = 20;
		Assert.assertEquals(a, b, "Number does not match");
		System.out.println("Test1 Completed");
	}

	
	@Test
	public void test2() {
		System.out.println("Test2 started");
		String a = "Vignesh";
		Assert.assertEquals(a, "Vignesh", "Name does not match");
		System.out.println("Test2 Completed");
	}
	
}
