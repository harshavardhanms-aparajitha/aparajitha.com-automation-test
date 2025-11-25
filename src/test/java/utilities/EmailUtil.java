package utilities;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.io.File;
import java.util.Date;
import java.util.Properties;

/**
 * Simple email sender. Replace credentials and recipients appropriately.
 * Uses SMTP with STARTTLS (Gmail example). For Gmail use App Password if 2FA enabled.
 */
public class EmailUtil {

    // update these values
    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final String SMTP_PORT = "587";
    private static final String FROM = "harshavardhan.ms@aparajitha.com";
    private static final String PASSWORD = "bjyuxnvuebnhlleo";

    public static void sendReport(String[] recipients, String subject, String bodyHtml) {
        try {
            File latestReport = getLatestReportFile();
            if (latestReport == null) {
                System.err.println("EmailUtil: No report file found to send.");
                return;
            }

            Properties props = new Properties();
            props.put("mail.smtp.host", SMTP_HOST);
            props.put("mail.smtp.port", SMTP_PORT);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(FROM, PASSWORD);
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM));
            Address[] toAddrs = new Address[recipients.length];
            for (int i = 0; i < recipients.length; i++) {
                toAddrs[i] = new InternetAddress(recipients[i]);
            }
            message.setRecipients(Message.RecipientType.TO, toAddrs);
            message.setSubject(subject);
            message.setSentDate(new Date());

            // body part (HTML)
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent(bodyHtml, "text/html; charset=utf-8");

            // attachment: latest report
            MimeBodyPart attachPart = new MimeBodyPart();
            attachPart.attachFile(latestReport);

            Multipart mp = new MimeMultipart();
            mp.addBodyPart(bodyPart);
            mp.addBodyPart(attachPart);

            message.setContent(mp);

            Transport.send(message);
            System.out.println("📧 Email sent with report: " + latestReport.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("❌ ERROR sending email: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static File getLatestReportFile() {
        String reportsDir = System.getProperty("user.dir") + File.separator + "reports";
        File dir = new File(reportsDir);
        if (!dir.exists() || !dir.isDirectory()) return null;
        File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".html"));
        if (files == null || files.length == 0) return null;
        File latest = files[0];
        for (File f : files) {
            if (f.lastModified() > latest.lastModified()) latest = f;
        }
        return latest;
    }
}