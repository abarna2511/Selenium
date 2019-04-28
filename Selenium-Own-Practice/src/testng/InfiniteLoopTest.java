package testng;

import org.testng.annotations.Test;

public class InfiniteLoopTest {
	
	@Test(timeOut = 2000)
	public void infiniteLoop() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
		}
	}

}
