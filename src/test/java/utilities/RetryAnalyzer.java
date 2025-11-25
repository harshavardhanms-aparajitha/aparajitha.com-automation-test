package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Simple retry analyzer - set retry limit as needed.
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private final int maxRetryCount = 1; // set to 1 or 2 if you want retries

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}