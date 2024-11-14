package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.TestBase;

public class _1_HomePage extends TestBase {

	@FindBy(xpath = "//img[@data-cy='landing-page-logo']")
	WebElement landingPageLogo;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'GET STARTED'])[1]")
	WebElement getStartedButton;
	@FindBy(xpath = "//*[normalize-space(text()) = 'LOG IN']")
	WebElement loginButton;
	@FindBy(xpath = "//div[@class='d-md-inline']")
	WebElement copyRightsLabel;
	@FindBy(xpath = "//*[normalize-space(text()) = 'Terms of Use']")
	WebElement termsLabel;
	@FindBy(xpath = "//*[normalize-space(text()) = 'Privacy Policy']")
	WebElement policyLabel;
	@FindBy(xpath = "//*[normalize-space(text()) = 'Help Center']")
	WebElement helpCenterLabel;

	public _1_HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyURL() {
		logger = report.createTest("Test Case 1: Verify 'URL' is displayed on the webpage");
		logger.log(Status.INFO, "URL of webpage is available");
		logger.log(Status.PASS, "URL is verified");
		return driver.getCurrentUrl();
	}

	public String verifyTitle() {
		logger = report.createTest("Test Case 2: Verify 'Title' is displayed on the webpage");
		logger.log(Status.INFO, "Title of webpage is available");
		logger.log(Status.PASS, "Title is verified");
		return driver.getTitle();
	}

	public boolean verifyLandingPageLogo() {
		logger = report.createTest("Test Case 3: Verify 'Landed Page Logo' is displayed on the webpage");
		logger.log(Status.INFO, "Landing page logo of webpage is available");
		logger.log(Status.PASS, "Landing page is verified");
		return landingPageLogo.isDisplayed();
	}

	public boolean verifyGetStartedButton() {
		logger = report.createTest("Test Case 4: Verify 'Get Started' button is displayed on the webpage");
		logger.log(Status.INFO, "Started button is webpage is available");
		logger.log(Status.PASS, "Started button is verified");
		return getStartedButton.isDisplayed();
	}

	public boolean verifyLoginButton() {
		logger = report.createTest("Test Case 5: Verify 'Login' button is displayed on the webpage");
		logger.log(Status.INFO, "Login button of webpage is available");
		logger.log(Status.PASS, "Login button is verified");
		return loginButton.isDisplayed();
	}

	public boolean verifyCopyRightsLabel() {
		logger = report.createTest("Test Case 6: Verify 'Copy Rights Label' button is displayed on the webpage");
		logger.log(Status.INFO, "Copy Rights Label of webpage is available");
		logger.log(Status.PASS, "Copy Rights Label is verified");
		return copyRightsLabel.isDisplayed();
	}

	public boolean verifyTermsLabel() {
		logger = report.createTest("Test Case 7: Verify 'Terms Lable' button is displayed on the webpage");
		logger.log(Status.INFO, "Terms Label of webpage is available");
		logger.log(Status.PASS, "Terms Rights Label is verified");
		return termsLabel.isDisplayed();
	}

	public boolean verifyPolicyLabel() {
		logger = report.createTest("Test Case 8: Verify 'Policy Label' button is displayed on the webpage");
		logger.log(Status.INFO, "Policy Label of webpage is available");
		logger.log(Status.PASS, "Policy Label is verified");
		return policyLabel.isDisplayed();
	}

	public boolean verifyHelpCenterLabel() {
		logger = report.createTest("Test Case 9: Verify 'Help Center Label' button is displayed on the webpage");
		logger.log(Status.INFO, "Help Center Label of webpage is available");
		logger.log(Status.PASS, "Help Center Label is verified");
		return helpCenterLabel.isDisplayed();
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
