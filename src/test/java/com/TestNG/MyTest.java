package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	@Test(retryAnalyzer = Retry_Class.class)
	private void stringEqual1() {
		String expected = "Sakthivel";
		String actual = "Sakthivel";
		Assert.assertEquals(expected, actual);
	}
	@Test(retryAnalyzer = Retry_Class.class)
	private void stringEqual2() {
		String expected = "Sakthi";
		String actual = "vasanth";
		Assert.assertEquals(expected, actual);
	}
}
