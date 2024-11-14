package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages._1_HomePage;
import Pages._2_LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadFileData;

public class _2_LoginPageTestCase extends TestBase {
	
	_2_LoginPage login;

	@BeforeMethod(alwaysRun = true)
	public void init() {
		initialization();
		_1_HomePage home = new _1_HomePage();
		home.clickLoginButton();
		
		login = new _2_LoginPage();
	}
	
	
	@Test(enabled = false, groups = {"Sanity"},priority = 0)
	public void verifyLoginPageURLTest() throws Exception, IOException {
		String expResult = ReadFileData.getExcelData(1, 3);
		String actResult = login.verifyLoginPageURL();
		
		Assert.assertEquals(expResult, actResult);
		Reporter.log("After clicking login button URL is:- "+actResult);
	}
	
	@Test(enabled = true,groups = {"Sanity"},priority = 1)
	public void verifyBrandLogoTest() {
		boolean actResult = login.verifyBrandLogo();

        Assert.assertTrue(actResult);
		Reporter.log("Brand logo showing in webpage:- "+ true);
	}
	
	
	@Test(enabled = true,groups = {"Sanity"},priority = 2)
	public void verifyCreateAccountLinkTest() {
		boolean actResult = login.verifyCreateAccountLink();

        Assert.assertTrue(actResult);
		Reporter.log("Create account link showing in page:- "+ true);
	}
	
	
	
	@Test(enabled = true,groups = {"Sanity"},priority = 3)
	public void verifyUserNameTextBoxTest() {
		boolean actResult = login.verifyUserNameTextBox();

        Assert.assertTrue(actResult);
		Reporter.log("Username text box showing in the website:- "+ true);
	}
	
	
	
	@Test(enabled = true,groups = {"Sanity"},priority = 4)
	public void verifyPasswordTextBoxTest() {
		boolean actResult = login.verifyPasswordTextBox();

        Assert.assertTrue(actResult);
		Reporter.log("Username text box showing in the website:- "+ true);
	}
	
	
	@Test(enabled = true,groups = {"Sanity"},priority = 5)
	public void verifyLoginButtonTest() {
		boolean actResult = login.verifyLoginButton();

        Assert.assertTrue(actResult);
		Reporter.log("Login button showing in website:- "+ true);
	}
	
	@Test(enabled = true,groups = {"Sanity"},priority = 6)
	public void verifyForgavePasswordLinkTest() {
		boolean actResult = login.verifyForgatePasswordLink();

        Assert.assertTrue(actResult);
		Reporter.log("Forgave password link  showing in website:- "+ true);
	}
	
	@Test(enabled = true,groups = {"Sanity"})
	public void verifyBackButtonTest() {
		boolean actResult = login.verifyBackButton();

        Assert.assertTrue(actResult);
		Reporter.log("Back button showing in website:- "+ true);
	}
	
	
	@Test(groups = {"Sanity","Regression"})
	public void verifyLoginToApplicationTest() throws IOException, InterruptedException {
		String expResult = ReadFileData.getExcelData(1, 5);
		String actResult = login.verifyLoginToApplication();
		
		Assert.assertEquals(expResult, actResult);
		Reporter.log("After login User Profile Title:- "+actResult);
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult result) throws IOException {
		if(ITestResult.FAILURE == result.getStatus()) {
			CaptureScreenshot.getScreenshot(result.getName());
		}
		
		report.flush();
		driver.close();
	}

}
