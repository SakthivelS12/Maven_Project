package com.TestNG;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 3000) //outside time seconds higher than inside thread time seconds
	private void credentials() throws InterruptedException {
		System.out.println("UserName");
		Thread.sleep(2000);
		System.out.println("Password");

	}
}
