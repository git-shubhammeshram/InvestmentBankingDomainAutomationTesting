package TestCases;

import java.io.IOException;

import Pages._4_ProfileSettingPage;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages._1_HomePage;
import Pages._2_LoginPage;
import Pages._3_PortfolioPage;
import Utility.CaptureScreenshot;
import Utility.ReadFileData;

public class _4_PorfileSettingPageTestCase extends TestBase {

    _4_ProfileSettingPage setting;

    @BeforeMethod(alwaysRun = true)
    public void init() throws IOException, InterruptedException {
        initialization();
        _1_HomePage home = new _1_HomePage();
        home.clickLoginButton();

        _2_LoginPage login = new _2_LoginPage();
        login.verifyLoginToApplication();

        _3_PortfolioPage portfolio = new _3_PortfolioPage();
        portfolio.verifyUserProfile();

        setting = new _4_ProfileSettingPage();

    }

    @Test
    public void verifyURLTest() throws EncryptedDocumentException, IOException {
        String expResult = ReadFileData.getExcelData(1, 12);
        String actResult = setting.verifyURL();

        Assert.assertEquals(expResult, actResult);
        Reporter.log("URL shown in the webpage:- " + actResult);
    }

    @Test
    public void verifyTitleTest() throws EncryptedDocumentException, IOException, InterruptedException {
        String expResult = ReadFileData.getExcelData(1, 13);
        String actResult = setting.verifyTitle();

        Assert.assertEquals(expResult, actResult);
        Reporter.log("Title shown in the webpage:- " + actResult);
    }

    @Test
    public void verifyAccountInformationLabelTest() {
        boolean actResult = setting.verifyAccountInformationLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Account Information Label is show on webpage:- " + true);
    }

    @Test
    public void verifyEmailSettingLabelTest() {
        boolean actResult = setting.verifyEmailSettingLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Email Setting Label is show on webpage:- " + true);
    }

    @Test
    public void verifyUsernameLabelTest() {
        boolean actResult = setting.verifyUsernameLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Username Label is show on webpage:- " + true);
    }

    @Test
    public void verifyEmailAddressLabelTest() {
        boolean actResult = setting.verifyEmailAddressLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Email Address Label is show on webpage:- " + true);
    }

    @Test
    public void verifyPasswordLabelTest() {
        boolean actResult = setting.verifyPasswordLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Password  Label is show on webpage:- " + true);
    }

    @Test
    public void verifyUpdatePasswordButtonTest() {
        boolean actResult = setting.verifyUpdatePasswordButton();

        Assert.assertTrue(actResult);
        Reporter.log("Update  Password Button is show on webpage:- " + true);
    }

    @Test
    public void verifyJoinDateLabelTest() {
        boolean actResult = setting.verifyJoinDateLabel();

        Assert.assertTrue(actResult);
        Reporter.log("Join Date Label is show on webpage:- " + true);
    }

    @Test
    public void verifyTradeConfirmationEmailsToggleTest() {
        boolean actResult = setting.verifyTradeConfirmationEmailsToggle();

        Assert.assertTrue(actResult);
        Reporter.log("Trade Confirmation Email Toggle is enabled on webpage:- " + true);
    }

    @Test
    public void verifyTradeStockLinkTest() {
        boolean actResult = setting.verifyTradeStockLink();

        Assert.assertTrue(actResult);
        Reporter.log("Trade Stock Link is show on webpage:- " + true);
    }

    @Test
    public void verifyResearchTheMarketLinkTest() {
        boolean actResult = setting.verifyResearchTheMarketLink();

        Assert.assertTrue(actResult);
        Reporter.log("Research Market Link is show on webpage:- " + true);
    }

    @Test
    public void verifyGotoPortfolioLinkTest() {
        boolean actResult = setting.verifyGotoPortfolioLink();

        Assert.assertTrue(actResult);
        Reporter.log("Portfolio Link is show on webpage:- " + true);
    }

    @Test
    public void verifyUserGotoBackProfileTest() throws EncryptedDocumentException, IOException {
        String expResult = ReadFileData.getExcelData(1, 9);
        String actResult = setting.verifyUserGotoBackProfile();

        Assert.assertEquals(expResult, actResult);
        Reporter.log("Portfolio Title' is show on webpage:- " + actResult);
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
