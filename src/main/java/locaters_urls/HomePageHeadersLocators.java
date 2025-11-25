package locaters_urls;

import org.openqa.selenium.By;

public class HomePageHeadersLocators {
	
	 // ====== TOP-LEVEL HEADER ITEMS ======
    public static final By SERVICES_DROPDOWN = By.xpath("(//a[text()='Services'])[1]");
    public static final By PRODUCTS_DROPDOWN = By.xpath("(//*[text() = 'Products'])[1]");
    public static final By ELIBRARY_DROPDOWN = By.xpath("(//*[text() = 'e-Library'])[1]");
    public static final By RESOURCES_DROPDOWN = By.xpath("(//*[contains(text(), 'Resources')])[1]");
    public static final By ABOUTUS_DROPDOWN = By.xpath("(//*[contains(text(), 'About Us')])[1]");
    // There are two index variants used in different places — keep the [2] one as primary per your mapping
    public static final By LOGIN_DROPDOWN = By.xpath("(//*[contains(text(), 'Login')])[2]");
    // alternate / fallback (if needed)
   


    // ====== SERVICES DROPDOWN (9 tabs) ======
    public static final By SERVICE_COMPLIANCE_RISK_AUDIT = By.xpath("(//*[contains(text(), 'Compliance Risk Audit')])[2]");
    public static final By SERVICE_VALIDATE_RISK_AUDIT = By.xpath("(//*[contains(text(), 'Risk Audit')])[9]");

    public static final By SERVICE_ESTABLISHMENT_COMPLIANCES = By.xpath("(//*[contains(text(), 'Establishment Compliances')])[2]");
    public static final By SERVICE_VALIDATE_ESTABLISHMENT = By.xpath("//*[text()='Compliances']");

    public static final By SERVICE_PAYROLL_COMPLIANCE_SERVICES = By.xpath("(//*[contains(text(), 'Payroll Compliance Services')])[2]");
    public static final By SERVICE_VALIDATE_PAYROLL_COMPLIANCE = By.xpath("//*[text()='Compliance Services']");

    public static final By SERVICE_FACTORY_COMPLIANCE_SERVICES = By.xpath("(//*[contains(text(), 'Factory Compliance Services')])[2]");
    public static final By SERVICE_VALIDATE_FACTORY_COMPLIANCE = By.xpath("//*[text()='Compliance Services']");

    public static final By SERVICE_VENDOR_COMPLIANCE_SERVICES = By.xpath("(//*[contains(text(), 'Vendor Compliance Services')])[2]");
    public static final By SERVICE_VALIDATE_VENDOR_COMPLIANCE = By.xpath("//*[text()='Compliance Services']");

    public static final By SERVICE_MINES_COMPLIANCE_SERVICES = By.xpath("(//*[contains(text(), 'Mines Compliance Services')])[2]");
    public static final By SERVICE_VALIDATE_MINES_COMPLIANCE = By.xpath("//*[text()='Compliance Services']");

    public static final By SERVICE_FLEXI_STAFFING_SERVICES = By.xpath("(//*[contains(text(), 'Flexi Staffing Services')])[2]");
    public static final By SERVICE_VALIDATE_FLEXI_STAFFING = By.xpath("//*[text()='Staffing Services']");

    public static final By SERVICE_PAYROLL_SERVICES = By.xpath("(//*[contains(text(), 'Payroll Services')])[2]");
    public static final By SERVICE_VALIDATE_PAYROLL = By.xpath("//*[text()=' Services']");

    public static final By SERVICE_EHS = By.xpath("(//*[contains(text(), 'Environmental, Health, & Safety (EHS)')])[2]");
    public static final By SERVICE_VALIDATE_EHS = By.xpath("//*[text() = 'Environmental, Health, & Safety (EHS) ']");


    // ====== PRODUCTS DROPDOWN (4 tabs) ======
    public static final By PRODUCT_SIMPLIANCE_CLASSIC = By.xpath("(//*[contains(text(), ' Simpliance Classic')])[1]");
    public static final By PRODUCT_VALIDATE_CLASSIC = By.xpath("//*[text() = 'Real-Time Labour Law Compliance Monitoring Tool ']");

    public static final By PRODUCT_SIMPLIANCE_REMO = By.xpath("(//*[contains(text(), 'Simpliance REMO')])[2]");
    public static final By PRODUCT_VALIDATE_REMO = By.xpath("//*[text()= 'REMO:']");

    public static final By PRODUCT_SIMPLIANCE_VENDOR = By.xpath("(//*[contains(text(), ' Simpliance Vendor')])[1]");
    public static final By PRODUCT_VALIDATE_VENDOR = By.xpath("//*[text() = 'Simpliance ']");

    public static final By PRODUCT_SIMPLIANCE_AUDIT = By.xpath("(//*[contains(text(), 'Simpliance Audit')])[2]");
    public static final By PRODUCT_VALIDATE_AUDIT = By.xpath("//*[text() = 'Comprehensive  Audit Management Platform']");


 // ====== e-LIBRARY DROPDOWN ======
    //public static final By ELIBRARY_DROPDOWN1 = By.xpath("(//*[text() = 'e-Library'])[1]");

    public static final By ELIBRARY_LATEST_MIN_WAGES = By.xpath("(//*[contains(text(), 'Latest Minimum Wages')])[2]");
    public static final By ELIBRARY_VALIDATE_MIN_WAGE = By.xpath("(//*[contains(normalize-space(text()), 'Minimum Wage')])[4]");

    public static final By ELIBRARY_PROFESSIONAL_TAX = By.xpath("(//*[contains(text(), 'Professional Tax')])[2]");
    public static final By ELIBRARY_VALIDATE_PROFESSIONAL_TAX = By.xpath("(//*[contains(normalize-space(text()), 'Professional Tax')])[4]");

    public static final By ELIBRARY_LABOUR_WELFARE_FUND = By.xpath("(//*[contains(text(), 'Labour Welfare Fund')])[2]");
    public static final By ELIBRARY_VALIDATE_LABOUR_WELFARE = By.xpath("(//*[contains(normalize-space(text()), 'Labour Welfare Fund')])[4]");

    public static final By ELIBRARY_LEAVE_WORKING_HOURS = By.xpath("(//*[contains(text(), 'Leave & Working Hours')])[2]");
    public static final By ELIBRARY_VALIDATE_LEAVE_WORKING_HOURS = By.xpath("(//*[contains(normalize-space(text()), 'Leave & Working Hours')])[3]");

    public static final By ELIBRARY_HOLIDAYS_LIST = By.xpath("(//*[contains(text(), 'Holidays List')])[2]");
    public static final By ELIBRARY_VALIDATE_HOLIDAYS = By.xpath("(//*[contains(normalize-space(text()), 'Holidays')])[3]");

    public static final By ELIBRARY_PROVIDENT_FUND = By.xpath("(//*[contains(text(), 'Provident Fund')])[2]");
    public static final By ELIBRARY_VALIDATE_PROVIDENT_FUND = By.xpath("(//*[contains(normalize-space(text()), 'Provident Fund')])[4]");

    // Calendars (PDF links)
    public static final By ELIBRARY_LEI_COMPLIANCE_CALENDAR = By.xpath("(//*[contains(text(), 'LEI Compliance Calendar')])[2]");
    public static final By ELIBRARY_LEI_CALENDAR_LINK = By.xpath("//a[contains(@href,'calendar.pdf')]");

    public static final By ELIBRARY_FCC_COMPLIANCE_CALENDAR = By.xpath("(//*[contains(text(), 'FCC Compliance Calendar')])[2]");
    public static final By ELIBRARY_FCC_CALENDAR_LINK = By.xpath("//a[contains(@href,'Compliance_Calendar_FCC.pdf')]");

    // ====== RESOURCES DROPDOWN (8 tabs) ======
    public static final By RESOURCES_EVENTS = By.xpath("(//*[contains(text(), 'Events')])[2]");
    public static final By RESOURCES_VALIDATE_EVENTS = By.xpath("//h3[contains(text(), 'Events')]");

    public static final By RESOURCES_CASE_STUDIES = By.xpath("(//*[contains(text(), 'Case Studies')])[2]");
    public static final By RESOURCES_VALIDATE_CASE_STUDIES = By.xpath("(//*[text() = 'Case Studies'])[5]");

    public static final By RESOURCES_BLOG = By.xpath("(//*[contains(text(), 'Blog')])[2]");
    public static final By RESOURCES_VALIDATE_BLOG = By.xpath("//*[text()= 'Popular Blog']");

    public static final By RESOURCES_MEDIA_PRESS = By.xpath("(//*[contains(text(), 'Media & Press Release')])[2]");
    public static final By RESOURCES_VALIDATE_MEDIA_PRESS = By.xpath("(//*[text()= 'Media & Press Releases'])[1]");

    public static final By RESOURCES_CSR = By.xpath("(//*[contains(text(), 'CSR')])[2]");
    public static final By RESOURCES_VALIDATE_CSR = By.xpath("(//*[text() = 'CSR Policy'])[1]");

    public static final By RESOURCES_WEBINAR = By.xpath("(//*[contains(text(), 'Webinar')])[2]");
    public static final By RESOURCES_VALIDATE_WEBINAR = By.xpath("(//*[contains(text(), 'Webinars')])[3]");

    public static final By RESOURCES_ITES_REPORT = By.xpath("(//*[contains(text(), 'ITeS Report')])[2]");
    public static final By RESOURCES_VALIDATE_ITES_REPORT = By.xpath("//*[text() = 'Download the Report']");

    public static final By RESOURCES_ESDM_REPORT = By.xpath("(//*[contains(text(), 'ESDM Industry Report')])[2]");
    public static final By RESOURCES_VALIDATE_ESDM_REPORT = By.xpath("//*[text() = 'Download the Report']");


    // ====== ABOUT US DROPDOWN (5 tabs) ======
    public static final By ABOUT_US_OUR_COMPANY = By.xpath("(//*[contains(text(), 'Our Company')])[1]");
    public static final By ABOUT_US_VALIDATE_OUR_COMPANY = By.xpath("(//*[text() = 'About Us'])[5]");

    public static final By ABOUT_US_MANAGEMENT = By.xpath("(//*[contains(text(), 'Management')])[2]");
    public static final By ABOUT_US_VALIDATE_MANAGEMENT = By.xpath("//img[@src=\"https://aparajitha.com/wp-content/uploads/2024/09/managemen-banner.webp\"]");

    public static final By ABOUT_US_OUR_CLIENTS = By.xpath("(//*[contains(text(), 'Our Clients')])[2]");
    public static final By ABOUT_US_VALIDATE_OUR_CLIENTS = By.xpath("//*[text()= 'Trusted by leading organizations for our expertise in compliance and governance solutions.']");

    public static final By ABOUT_US_CONTACT_US = By.xpath("(//*[contains(text(), 'Contact Us')])[2]");
    public static final By ABOUT_US_VALIDATE_CONTACT_US = By.xpath("//*[text() = 'you']");

    public static final By ABOUT_US_TESTIMONIALS = By.xpath("(//*[contains(text(), 'Testimonials')])[2]");
    public static final By ABOUT_US_VALIDATE_TESTIMONIALS = By.xpath("//*[text()= 'Hear from the People Who Matter Most - Our Clients! ']");


 // ====================== LOGIN DROPDOWN ======================

 // Top-level login options
 
 public static final By LOGIN_CUSTOMER = By.xpath("(//*[contains(text(), 'Customer Login')])[2]");
 public static final By LOGIN_EMPLOYEE = By.xpath("(//*[contains(text(), 'Employee Login')])[2]");


 // ====================== CUSTOMER LOGIN (9 tabs) ======================

 public static final By CUSTOMER_REMO = By.xpath("(//*[contains(text(), 'Remo')])[4]");
 public static final By CUSTOMER_VALIDATE_REMO = By.xpath("(//*[text() = 'Login'])[2]");

 public static final By CUSTOMER_VENDOR = By.xpath("(//*[contains(text(), 'Vendor')])[8]");
 public static final By CUSTOMER_VALIDATE_VENDOR = By.xpath("(//*[text() = 'Login'])[2]");

 public static final By CUSTOMER_CLASSIC = By.xpath("(//*[contains(text(), 'Classic')])[6]");
 public static final By CUSTOMER_VALIDATE_CLASSIC = By.xpath("//*[text() = ' Sign In ']");

 public static final By CUSTOMER_REMIT = By.xpath("(//*[contains(text(), 'Remit')])[2]");
 public static final By CUSTOMER_VALIDATE_REMIT = By.xpath("//*[text() = 'Login ']");

 public static final By CUSTOMER_TAMS = By.xpath("(//*[contains(text(), 'TAMS')])[3]");
 public static final By CUSTOMER_VALIDATE_TAMS = By.xpath("//*[text() = ' Sign In ']");

 public static final By CUSTOMER_AUDIT = By.xpath("(//*[contains(text(), 'Audit')])[9]");
 public static final By CUSTOMER_VALIDATE_AUDIT = By.xpath("//*[text() = ' Sign In ']");

 public static final By CUSTOMER_ELIBRARY_LOGIN = By.xpath("(//*[contains(text(), 'e-Library')])[4]");
 public static final By CUSTOMER_VALIDATE_ELIBRARY_LOGIN = By.xpath("//*[text() = 'Login to Your Account']");

 public static final By CUSTOMER_ESS = By.xpath("(//*[contains(text(), 'ESS')])[2]");
 public static final By CUSTOMER_VALIDATE_ESS = By.xpath("//*[contains(text(), 'Employer / Employee Self Service Portal')]");

 public static final By CUSTOMER_PF_ESI_HELPDESK = By.xpath("(//*[contains(text(), 'PF & ESI Helpdesk')])[2]");
 public static final By CUSTOMER_VALIDATE_PF_ESI = By.xpath("//*[text() = 'Aparajitha PF & ESI Helpdesk']");


 // ====================== EMPLOYEE LOGIN (12 tabs) ======================

 
 public static final By EMPLOYEE_MYPEOPLE = By.xpath("(//*[contains(text(), 'MyPeople')])[2]");
 public static final By EMPLOYEE_VALIDATE_MYPEOPLE = By.xpath("//*[contains(text(), 'Your complete online HR solution')]");

 public static final By EMPLOYEE_COLLECT = By.xpath("(//*[contains(text(), 'Collect')])[2]");
 public static final By EMPLOYEE_VALIDATE_COLLECT = By.xpath("//*[contains(text(), 'Sign in')]");

 public static final By EMPLOYEE_EXPENSES = By.xpath("(//*[contains(text(), 'Expenses')])[2]");
 public static final By EMPLOYEE_VALIDATE_EXPENSES = By.xpath("//*[text() = 'Expense Application']");

 public static final By EMPLOYEE_HELPDESK = By.xpath("(//*[contains(text(), 'Helpdesk')])[4]");
 public static final By EMPLOYEE_VALIDATE_HELPDESK = By.xpath("//*[text() = 'Aparajitha Helpdesk']");

 public static final By EMPLOYEE_RECRUIT = By.xpath("(//*[contains(text(), 'Recruit')])[2]");
 public static final By EMPLOYEE_VALIDATE_RECRUIT = By.xpath("(//*[text() = 'Sign in'])[1]");

 public static final By EMPLOYEE_GENERAL_MASTERS = By.xpath("(//*[contains(text(), 'General Masters')])[2]");
 public static final By EMPLOYEE_VALIDATE_GENERAL_MASTERS = By.xpath("//*[text() = 'Sign in']");

 public static final By EMPLOYEE_STATUTORY_MASTERS = By.xpath("(//*[contains(text(), 'Statutory Masters')])[2]");
 public static final By EMPLOYEE_VALIDATE_STATUTORY_MASTERS = By.xpath("//*[text() = 'Sign in ']");

 public static final By EMPLOYEE_USER_ADMINISTRATION = By.xpath("(//*[contains(text(), 'User Administration')])[2]");
 public static final By EMPLOYEE_VALIDATE_USER_ADMINISTRATION = By.xpath("//*[text() = ' Sign In ']");

 public static final By EMPLOYEE_TAMS = By.xpath("(//*[contains(text(), 'TAMS')])[4]");
 public static final By EMPLOYEE_VALIDATE_TAMS = By.xpath("//*[text() = ' Sign In ']");

 public static final By EMPLOYEE_REMO_ADMIN_VPN = By.xpath("(//*[contains(text(), 'Remo Admin (VPN)')])[2]");
 public static final By EMPLOYEE_VALIDATE_REMO_ADMIN_VPN = By.xpath("(//*[text() = 'Login'])[2]");

 public static final By EMPLOYEE_REMO_SP_LOGIN = By.xpath("(//*[contains(text(), 'Remo SP Login')])[2]");
 public static final By EMPLOYEE_VALIDATE_REMO_SP_LOGIN = By.xpath("//*[text() = 'LOGIN']");

 public static final By EMPLOYEE_CLASSIC_AUDIT = By.xpath("(//*[contains(text(), 'Classic/Audit')])[2]");
 public static final By EMPLOYEE_VALIDATE_CLASSIC_AUDIT = By.xpath("//*[text() = ' Sign In ']");

    // ====== CAREER VALIDATOR ======
 public static final By CAREER_LINK = By.xpath("(//a[@aria-label=\"Career\"])[1]");   
 public static final By CAREER_VALIDATE_TEXT = By.xpath("//*[text()= 'View Openings']");

}
