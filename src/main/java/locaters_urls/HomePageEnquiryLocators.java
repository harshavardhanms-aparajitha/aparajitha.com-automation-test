package locaters_urls;

import org.openqa.selenium.By;

public class HomePageEnquiryLocators {

    // ====== ENQUIRE NOW FORM (Home Page Header) ======
    public static final By ENQUIRE_NOW_BUTTON = By.xpath("//*[contains(text(), 'Enquire Now')]");
    public static final By FORM_NAME = By.xpath("//*[@id='form-field-name']");
    public static final By FORM_EMAIL = By.xpath("//*[@placeholder='Company Email ID']");
    public static final By FORM_COMPANY = By.xpath("//*[@placeholder='Company Name']");
    public static final By FORM_DESIGNATION = By.xpath("//*[@placeholder='Designation']");
    public static final By FORM_CONTACT = By.xpath("//*[@placeholder='Contact No.']");
    public static final By FORM_LOCATION = By.xpath("//*[@placeholder='Location']");
    public static final By FORM_MESSAGE = By.xpath("//*[@placeholder='Your Message']");
    public static final By FORM_PRIVACY_CHECK = By.xpath("(//*[contains(text(), 'By proceeding, you are indicating your acceptance of the Aparajitha')])");
    public static final By FORM_SUBMIT_BUTTON = By.xpath("//*[@class=\"elementor-field-group elementor-column elementor-field-type-submit elementor-col-20 e-form__buttons\"]");

    // ====== CONTACT US FORM (New Tab) ======
    public static final String CONTACT_US_URL = "https://aparajitha.com/contact-us-form/";
    
 // ====== VALIDATION MESSAGES ======
    public static final By VALIDATION_NAME = By.xpath("//*[text()='Name must be 3–30 characters.']");
    public static final By VALIDATION_EMAIL = By.xpath("//*[text()='Too many subdomains in email.']");
    public static final By VALIDATION_COMPANY = By.xpath("(//*[text()='Must be 3–50 characters.'])[1]");
    public static final By VALIDATION_DESIGNATION = By.xpath("(//*[text()='Must be 3–50 characters.'])[2]");
    public static final By VALIDATION_CONTACT = By.xpath("//*[text()='Phone number must be 10 digits.']");
    public static final By VALIDATION_LOCATION = By.xpath("(//*[text()='Must be 3–50 characters.'])[3]");
    public static final By VALIDATION_MESSAGE = By.xpath("//*[text()='Message must be 10–1000 characters.']");
    
 // ====== ITeS REPORT FORM (New Tab) ======
    public static final String ITES_REPORT_URL = "https://aparajitha.com/ites-report/";
    public static final By ITES_FULL_NAME = By.xpath("//*[@placeholder='Enter Full Name']");
    public static final By ITES_CONTACT = By.xpath("//*[@placeholder='Enter Contact No.']");
    public static final By ITES_EMAIL = By.xpath("//*[@placeholder='Enter Corporate Email ID']");
    public static final By DOWNLOAD_NOW_BUTTON = By.xpath("//*[contains(text(), 'Download Now')]");
    public static final By ERROR_MSG_RECAPTCHA = By.xpath("//*[text()='The Captcha field cannot be blank. Please enter a value.']");

    // ====== ESDM INDUSTRY REPORT FORM (New Tab) ======
    public static final String ESDM_REPORT_URL = "https://aparajitha.com/esdm-industry-report/";
    
 // ====== ITeS FIELD VALIDATION MESSAGES ======
    public static final By VALIDATION_ITES_NAME = By.xpath("//*[text()='Name must be 3–30 characters.']");
    public static final By VALIDATION_ITES_CONTACT = By.xpath("//*[text()='Phone number must be 10 digits.']");
    public static final By VALIDATION_ITES_EMAIL = By.xpath("//*[text() = 'Invalid domain.']");
    
  //  ESDM INDUSTRY REPORT FORM ======

    		public static final By ESDM_FULL_NAME = By.xpath("//*[@placeholder='Enter Full Name']");
    		public static final By ESDM_CONTACT = By.xpath("//*[@placeholder='Enter Contact No.']");
    		public static final By ESDM_EMAIL = By.xpath("//*[@placeholder='Enter Corporate Email ID']");
    		public static final By ESDM_DOWNLOAD_NOW_BUTTON = By.xpath("//*[contains(text(), 'Download Now')]");
    
 // ====== ESDM FIELD VALIDATION MESSAGES ======
    public static final By VALIDATION_ESDM_NAME = By.xpath("//*[text()='Name must be 3–30 characters.']");
    public static final By VALIDATION_ESDM_CONTACT = By.xpath("//*[text()='Phone number must be 10 digits.']");
    public static final By VALIDATION_ESDM_EMAIL = By.xpath("//*[text() = 'Invalid domain.']");
	public static final By FORM_SUCCESS_MSG = By.xpath("//*[text()='Thank You']");    
    
 
}