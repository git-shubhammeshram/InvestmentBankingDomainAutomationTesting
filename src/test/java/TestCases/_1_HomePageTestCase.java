package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages._1_HomePage;
import Utility.CaptureScreenshot;
import Utility.ReadFileData;

public class _1_HomePageTestCase extends TestBase {

    _1_HomePage login;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        initialization();

        login = new _1_HomePage();
    }

    @Test(enabled = true, groups = {"Regression"}, priority = 0)
    public void verifyURLTest() throws EncryptedDocumentException, IOException {
        String expResult = ReadFileData.getExcelData(1, 0);
        String actResult = login.verifyURL();

        Assert.assertEquals(expResult, actResult);
        Reporter.log(" 'URL' is showing on Webpage " + actResult);

    }

    @Test(enabled = true, groups = {"Regression"}, priority = 1)
    public void verifyTitleTest() throws EncryptedDocumentException, IOException {
        String expResult = ReadFileData.getExcelData(1, 1);
        String actResult = login.verifyTitle();

        Assert.assertEquals(expResult, actResult);
        Reporter.log(" 'Title' is showing on Webpage");
    }


    @Test(enabled = true, groups = {"Regression"}, priority = 2)
    public void verifyLandingPageLogoTest() {
        boolean actResult = login.verifyLandingPageLogo();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Landing Logo' is showing on Webpage" + true);
    }


    @Test(enabled = true, groups = {"Regression"}, priority = 3)
    public void verifyGetStartedButtonTest() {
        boolean actResult = login.verifyGetStartedButton();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Started Button' is showing on Webpage" + true);
    }


    @Test(enabled = true, groups = {"Regression"}, priority = 4)
    public void verifyLoginButtonTest() {
        boolean actResult = login.verifyLoginButton();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Login Button' is showing on Webpage" + true);
    }


    @Test(enabled = true, groups = {"Regression"}, priority = 5)
    public void verifyCopyRightsLabelTest() {
        boolean actResult = login.verifyCopyRightsLabel();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Copy Rights Label' is showing on Webpage" + true);
    }

    @Test(enabled = true, groups = {"Regression"}, priority = 6)
    public void verifyTermsLabelTest() {
        boolean actResult = login.verifyTermsLabel();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Terms label' is showing on Webpage" + true);
    }

    @Test(enabled = true, groups = {"Regression"}, priority = 7)
    public void verifyPolicyLabelTest() {
        boolean actResult = login.verifyPolicyLabel();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Policy Label' is showing on Webpage" + true);
    }


    @Test(enabled = true, groups = {"Regression"}, priority = 8)
    public void verifyHelpCenterLabelTest() {
        boolean actResult = login.verifyHelpCenterLabel();

        Assert.assertTrue(actResult);
        Reporter.log(" 'Help Center' Label is showing on Webpage" + true);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            CaptureScreenshot.getScreenshot(result.getName());
        }

        report.flush();
        driver.close();
    }

}
