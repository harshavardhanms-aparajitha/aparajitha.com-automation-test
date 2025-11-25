package headers_SanityTest;

import baseClass.BaseTest;
import locaters_urls.HomePageHeadersLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResourcesTests extends BaseTest {

    // ============================================================
    //                    RESOURCES → TEST CASES
    // ============================================================

    @Test(priority = 1)
    public void verifyEventsTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_EVENTS
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_EVENTS).isDisplayed(),
                "❌ Events page not loaded correctly!"
        );
    }

    @Test(priority = 2)
    public void verifyCaseStudiesTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_CASE_STUDIES
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_CASE_STUDIES).isDisplayed(),
                "❌ Case Studies page not loaded correctly!"
        );
    }

    @Test(priority = 3)
    public void verifyBlogTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_BLOG
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_BLOG).isDisplayed(),
                "❌ Blog page not loaded correctly!"
        );
    }

    @Test(priority = 4)
    public void verifyMediaPressTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_MEDIA_PRESS
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_MEDIA_PRESS).isDisplayed(),
                "❌ Media & Press Release page not loaded correctly!"
        );
    }

    @Test(priority = 5)
    public void verifyCSRTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_CSR
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_CSR).isDisplayed(),
                "❌ CSR page not loaded correctly!"
        );
    }

    @Test(priority = 6)
    public void verifyWebinarTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_WEBINAR
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_WEBINAR).isDisplayed(),
                "❌ Webinar page not loaded correctly!"
        );
    }

    @Test(priority = 7)
    public void verifyITeSReportTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_ITES_REPORT
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_ITES_REPORT).isDisplayed(),
                "❌ ITeS Report page not loaded correctly!"
        );
    }

    @Test(priority = 8)
    public void verifyESDMReportTab() {
        hoverAndClick(
                HomePageHeadersLocators.RESOURCES_DROPDOWN,
                HomePageHeadersLocators.RESOURCES_ESDM_REPORT
        );

        Assert.assertTrue(
                waitForVisibility(HomePageHeadersLocators.RESOURCES_VALIDATE_ESDM_REPORT).isDisplayed(),
                "❌ ESDM Industry Report page not loaded correctly!"
        );
    }
}
