package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {
	int count = 1;
	int limit = 6;
	@Override
	public boolean retry(ITestResult result) {
		if(count <= limit) {
			count++;
			return true;
		}
		return false;
	}	
}
