package DataFiles;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_logic implements IRetryAnalyzer{
     int currentNumber = 0;
     int NumberOfRetry = 1;
	@Override
	public boolean retry(ITestResult result) {
		if(currentNumber<NumberOfRetry ) {
			currentNumber ++;
			return true;
		}
		return false;
	}

}
