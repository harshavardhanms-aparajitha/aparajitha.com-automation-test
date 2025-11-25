package utilities;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.io.File;
import java.util.Properties;

public class EmailReportSender {

    /**
     * Automatically finds the LATEST generated Extent report
     */
    private static File getLatestReportFile() {
        File reportsDir = new File(System.getProperty("user.dir") + "/reports");

        if (!reportsDir.exists()) {
            System.err.println("❌ Reports folder does not exist: " + reportsDir.getAbsolutePath());
            return null;
        }

        File[] files = reportsDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".html"));

        if (files == null || files.length == 0) {
            System.err.println("❌ No HTML report files found in Reports folder!");
            return null;
        }

        // Sort by last modified → pick latest
        File latest = files[0];
        for (File f : files) {
            if (f.lastModified() > latest.lastModified()) {
                latest = f;
            }
        }

        System.out.println("📄 Latest Report Selected: " + latest.getAbsolutePath());
        return latest;
    }

    /**
     * Main Email Sender (called by EmailReportListener)
     */
    public static void sendReport(String[] recipients, String subject, String body) {

        File reportFile = getLatestReportFile();
        if (reportFile == null) {
            System.err.println("❌ FAILED: No report available to email.");
            return;
        }

        final String from = "harshavardhan.ms@aparajitha.com";   // update
        final String password = "bjyuxnvuebnhlleo";              // update

        try {

            // SMTP Setup
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            // Convert String[] → Address[]
            Address[] recipientAddresses = new Address[recipients.length];
            for (int i = 0; i < recipients.length; i++) {
                recipientAddresses[i] = new InternetAddress(recipients[i]);
            }
            message.setRecipients(Message.RecipientType.TO, recipientAddresses);

            message.setSubject(subject);

            // Email body
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent(body, "text/html");

            // Attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(reportFile);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("📧 Extent report email sent successfully!");

        } catch (Exception e) {
            System.err.println("❌ ERROR sending email: " + e.getMessage());
            e.printStackTrace();
        }
    }
}