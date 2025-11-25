package utilities;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Sends the latest Extent report via email when suite finishes.
 * Configure recipients inside this class or pass via system property.
 */
public class EmailReportListener implements ISuiteListener {

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("📨 EmailReportListener: Suite finished. Preparing to send Extent Report...");
        // recipients - update list as needed
        String[] recipients = new String[] {
                
                "harshavardhan.ms@aparajitha.com"
        };

        String reportPath = ExtentManager.getReportPath();
        String subject = "Aparajitha.com – Daily Sanity Automation Test Report - " + java.time.LocalDateTime.now();
        String body = "<p>Hi Team,</p>"
                + "<p>The automated sanity suite has finished. Please find the HTML report attached and the absolute path below:</p>"
                + "<p><b>Report Path:</b> " + reportPath + "</p>"
                + "<p>Regards,<br/>Automation QA</p>";

        EmailUtil.sendReport(recipients, subject, body);
        System.out.println("📨 EmailReportListener → Email sending triggered.");
    }

    @Override
    public void onStart(ISuite suite) {
        // no-op
    }
}