package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Singleton ExtentReports manager.
 */
public final class ExtentManager {

    private static ExtentReports extent;
    private static String reportPath;

    private ExtentManager() {}

    /**
     * Maintain backward compatibility with BaseTest:
     * BaseTest expects: ExtentManager.getExtentReports()
     */
    public static synchronized ExtentReports getExtentReports() {
        return getInstance();
    }

    /**
     * Actual ExtentReports instance creator
     */
    public synchronized static ExtentReports getInstance() {

        if (extent == null) {

            // Create reports directory
            String dir = System.getProperty("user.dir") + File.separator + "reports";
            File d = new File(dir);
            if (!d.exists()) d.mkdirs();

            // Timestamped report
            String ts = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            reportPath = dir + File.separator + "ExecutionReport_" + ts + ".html";

            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setDocumentTitle("Aparajitha Automation Report");
            spark.config().setReportName("Aparajitha Sanity Suite");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            // System Info
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
            extent.setSystemInfo("Executed By", "Harshavardhan MS");
        }
        return extent;
    }

    /**
     * Returns the generated report path
     */
    public static String getReportPath() {
        return reportPath;
    }
}