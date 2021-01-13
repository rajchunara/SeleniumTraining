package testNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut = 2000)
	public void infiniteLoopTest() {
		
	}
	
	//Without expectedExceptions this test will fail
	@Test(expectedExceptions = NumberFormatException.class)
	public void testException() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
