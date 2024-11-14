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
import Pages._2_LoginPage;
import Pages._3_PortfolioPage;
import Utility.CaptureScreenshot;
import Utility.ReadFileData;

public class _3_PortfolioPageTestCase extends TestBase {

	_3_PortfolioPage portfolio;

	@BeforeMethod(alwaysRun = true)
	public void init() throws IOException, InterruptedException {
		initialization();
		_1_HomePage home = new _1_HomePage();
		home.clickLoginButton();

		_2_LoginPage login = new _2_LoginPage();
		login.verifyLoginToApplication();

		portfolio = new _3_PortfolioPage();
	}

	@Test(enabled = false)
	public void verifyURLTest() throws EncryptedDocumentException, IOException {
		String expResult = ReadFileData.getExcelData(1, 7);
		String actResult = portfolio.verifyURL();

		Assert.assertEquals(expResult, actResult);
		Reporter.log("URL shown in the website: " + actResult);

	}

	@Test(enabled = true)
	public void verifyTitleTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String expResult = ReadFileData.getExcelData(1, 9);
		String actResult = portfolio.verifyTitle();

		Assert.assertEquals(expResult, actResult);
		Reporter.log("Title shown in the website: " + actResult);

	}

	@Test(enabled = true,groups = {"Sanity"})
	public void verifyPortfolioLogoTest() throws EncryptedDocumentException, IOException {
		boolean actResult = portfolio.verifyPortfolioLogo();

        Assert.assertTrue(actResult);
		Reporter.log("Logo shown in the website: " + true);

	}

	@Test(enabled = true,groups = {"Sanity"})
	public void verifyInvestopediaTradingGameLabelTest() throws EncryptedDocumentException, IOException {
		boolean actResult = portfolio.verifyInvestopediaTradingGameLabel();

        Assert.assertTrue(actResult);
		Reporter.log("Trading Label shown in the website: " + true);

	}

	@Test(enabled = false,groups = {"Sanity"})
	public void verifyGameInfoChartTest() throws EncryptedDocumentException, IOException {
		boolean actResult = portfolio.verifyGameInfoChart();

        Assert.assertTrue(actResult);
		Reporter.log("Game Chart  shown in the website: " + true);

	}

	@Test(enabled = true,groups = {"Sanity"})
	public void verifyHoldingChartTest() throws EncryptedDocumentException, IOException {
		boolean actResult = portfolio.verifyHoldingChart();

        Assert.assertTrue(actResult);
		Reporter.log("Holding Chart  shown in the website: " + true);

	}

	@Test(enabled = true,groups = {"Sanity"})
	public void overviewingChartTest() throws EncryptedDocumentException, IOException {
		boolean actResult = portfolio.verifyOverviewChart();

        Assert.assertTrue(actResult);
		Reporter.log("Overview Chart  shown in the website: " + true);

	}

	@Test(enabled = true,groups = {"Sanity"})
	public void verifyUserProfileTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String expResult = ReadFileData.getExcelData(1, 13);
		String actResult = portfolio.verifyUserProfile();

		Assert.assertEquals(expResult, actResult);
		Reporter.log("URL shown in the website: " + actResult);

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
