package com.TestNG;

import org.testng.annotations.Test;

public class Expected_Exception {
@Test(expectedExceptions = ArithmeticException.class )
private void Exception() {
	int a = 2;
	int b=0;
	int c = a/b;
	System.out.println(c);
}
}
