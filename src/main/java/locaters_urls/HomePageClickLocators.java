package locaters_urls;

import org.openqa.selenium.By;

public class HomePageClickLocators {

    // 🌐 Home Page URL
    public static final String HOME_URL = "https://aparajitha.com/";

    // 1️⃣ All Blogs
    public static final By ALL_BLOGS_BUTTON = By.xpath("//*[text()='Browse All Blogs']");
    public static final By ALL_BLOGS_VALIDATION = By.xpath("//*[text()='Popular Blog']");

    // 2️⃣ ISO/IEC Certificate
    public static final By ISO_IEC_CERTIFICATE = By.xpath("(//*[text() = 'View Certificate'])[1]");
    public static final String ISO_IEC_PDF_URL = "https://aparajitha.com/wp-content/uploads/2025/10/ISO-IEC_27001-ENG-C535413-4-20251013.pdf";

    // 3️⃣ ISO QMS Certificate
    public static final By ISO_QMS_CERTIFICATE = By.xpath("(//*[text() = 'View Certificate'])[2]");
    public static final String ISO_QMS_PDF_URL = "https://aparajitha.com/wp-content/uploads/2024/12/ISO-9001-C708873-1-en-US-20241120.pdf";

    // 4️⃣ Case Study
    public static final By CASE_STUDY_BUTTON = By.xpath("//*[text() = 'Browse All Case Studies']");
    public static final By CASE_STUDY_VALIDATION = By.xpath("//*[text()='Real-world success stories showcasing our expertise in delivering compliance and governance solutions.']");

    // 5️⃣ Canvas Upper Button
    public static final By CANVAS_BUTTON = By.xpath("//canvas[@id='canvas-695c0a16']");
    public static final By CANVAS_VALIDATION = By.xpath("//*[text() = 'Tech-driven comprehensive compliance solutions across industries, including ']");
    


    public static final By ALL_BLOGS = By.xpath("//*[text()='Browse All Blogs']");
    public static final By POPULAR_BLOG_VALIDATION_TEXT = By.xpath("//*[text()='Popular Blog']");

 
    public static final By CASE_STUDY_VALIDATION_TEXT = By.xpath("//*[text()='Real-world success stories showcasing our expertise in delivering compliance and governance solutions.']");

}