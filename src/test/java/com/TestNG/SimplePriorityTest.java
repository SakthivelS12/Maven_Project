package com.TestNG;

import org.testng.annotations.Test;

public class SimplePriorityTest {

	@Test(priority = 1)
	private void LoginCredetials() {
		System.out.println("Enter the valid Credentials");
	}
	@Test(priority = 0)
	private void LaunchURL() {
		System.out.println("URL");
	}
	@Test(priority = 2,invocationCount = 5)
	private void MyProfile() {
		System.out.println("MyProfile");
	}
}
