package testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

	int count = 0;

	public boolean retry(ITestResult result) {
		if(count < 1) {
			count++;
			return true; //continue the retry
		}
		
		return false; // stop the retry
	}

}
