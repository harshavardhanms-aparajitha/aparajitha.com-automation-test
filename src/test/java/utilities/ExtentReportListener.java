package utilities;

import com.aventstack.extentreports.*;
import org.testng.*;
import java.util.HashMap;
import java.util.Map;

/**
 * TestNG listener → Handles Extent reporting + Screenshots on Failure.
 */
public class ExtentReportListener implements ITestListener, ISuiteListener {

    private static final ExtentReports extent = ExtentManager.getInstance();

    // Thread-safe storage for each test
    private static final ThreadLocal<ExtentTest> tlTest = new ThreadLocal<>();

    // Mapping test ID → ExtentTest (backup reference)
    private final Map<String, ExtentTest> testMap = new HashMap<>();

    @Override
    public void onStart(ISuite suite) {
        // Extent already initialized
    }

    @Override
    public void onFinish(ISuite suite) {
        extent.flush();
        System.out.println("✔ Extent Report Generated at: " + ExtentManager.getReportPath());
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();

        ExtentTest test = extent.createTest(testName);
        tlTest.set(test);

        // Map for retrieval on failure
        testMap.put(getTestId(result), test);

        test.info("🔹 Test started: " + testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        tlTest.get().pass("✔ Test Passed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = getExtentTest(result);

        String testName = result.getMethod().getMethodName();
        test.fail("❌ Test Failed: " + testName);
        test.fail(result.getThrowable());

        // Capture screenshots
        String screenshotPath = ScreenshotUtil.captureScreenshotPNG(testName);
        String base64Image = ScreenshotUtil.captureScreenshotBase64();

        try {
            if (screenshotPath != null) {
                test.addScreenCaptureFromPath(screenshotPath);
            } else if (base64Image != null) {
                test.addScreenCaptureFromBase64String(base64Image);
            } else {
                test.warning("⚠ Screenshot was not captured!");
            }
        } catch (Exception e) {
            test.warning("⚠ Failed to attach screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        tlTest.get().skip("⚠ Test Skipped");
    }

    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) { }
    @Override public void onStart(ITestContext context) { }
    @Override public void onFinish(ITestContext context) { }

    private String getTestId(ITestResult result) {
        return result.getTestClass().getName() + "." + result.getMethod().getMethodName();
    }

    private ExtentTest getExtentTest(ITestResult result) {
        ExtentTest test = testMap.get(getTestId(result));
        return (test != null) ? test : tlTest.get();
    }
}