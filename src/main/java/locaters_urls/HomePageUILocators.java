package locaters_urls;

import org.openqa.selenium.By;

public class HomePageUILocators {

    // 1️⃣ Aparajitha Banner Text
    public static final By BANNER_TEXT = By.xpath("//*[text() = 'Tech-driven comprehensive compliance solutions across industries, including ']");

    // 2️⃣ 25 Years Celebrating Logo
    public static final By LOGO_25_YEARS = By.xpath("//img[@src='https://aparajitha.com/wp-content/uploads/2025/08/25th-banner-768x730.webp']");

    // 3️⃣ Clients Company Logos Carousel (The People Behind Our Success)
    public static final By CLIENTS_CAROUSEL = By.xpath("//*[@class='remove-animation elementor-element elementor-element-a58d6cb logo-carousel elementor-widget elementor-widget-loop-carousel e-widget-swiper']");

    // 4️⃣ Notifications Carousel
    public static final By NOTIFICATIONS_CAROUSEL = By.xpath("//*[@class='remove-animation elementor-element elementor-element-a1b2d59 elementor-widget elementor-widget-loop-carousel e-widget-swiper']");

    // 5️⃣ End-to-End Managed Services Carousel
    public static final By MANAGED_SERVICES_CAROUSEL = By.xpath("//*[@style='cursor: grab; transition-duration: 0ms; transform: translate3d(-690px, 0px, 0px); transition-delay: 0ms;']");

    // 6️⃣ Simpliance Products Container
    public static final By SIMPLIANCE_PRODUCTS_CONTAINER = By.xpath("//*[@class='elementor-element elementor-element-8a4380b e-con-full e-flex e-con e-child']");

    // 7️⃣ Browse All Blogs Button
    public static final By ALL_BLOGS_BUTTON = By.xpath("//*[text()='Browse All Blogs']");

    // 8️⃣ Our Certifications Layout
    public static final By CERTIFICATIONS_LAYOUT = By.xpath("(//*[@class='elementor-image-box-wrapper'])[1]");

    // 9️⃣ Case Study Layout
    public static final By CASE_STUDY_LAYOUT = By.xpath("//*[@class='elementor-element elementor-element-9c51ac5 e-flex e-con-boxed e-con e-parent']");

    // 🔟 Know More About Us Layout
    public static final By ABOUT_US_LAYOUT = By.xpath("//*[@class='elementor-element elementor-element-3073209 e-flex e-con-boxed e-con e-parent']");

    // 1️⃣1️⃣ Connect With Us Button
    public static final By CONNECT_WITH_US_BUTTON = By.xpath("//*[@aria-label='Connect With Us']");

    // 1️⃣2️⃣ Canvas Upper Button
    public static final By CANVAS_BUTTON = By.xpath("//canvas[@id='canvas-695c0a16']");
}
