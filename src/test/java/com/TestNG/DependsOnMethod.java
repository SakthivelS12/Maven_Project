package com.TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 0)
	private void Offer() {
		System.out.println("Diwali Offer");
	}
	@Test (dependsOnMethods = "Offer",priority = 1)
	private void Mobiles() {
	System.out.println("Mobile 10% discount for above Rs.40000");
	}
	@Test(dependsOnMethods = "Offer",priority = 2)
	private void electronics() {
	System.out.println("Laptop offer - 5% discount");
	}
	@Test (priority = 3)
	private void clothes() {
	System.out.println("Different fashion collection available");
	}
}
