package testng;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void exceptionHandle() {
		
		int a[] = {1,2,4};
		System.out.println(a[4]);
	}
	}
