package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.TestBase;

public class _4_ProfileSettingPage extends TestBase {

	@FindBy(xpath = "(//*[normalize-space(text()) = 'Account Information'])[1]")
	WebElement accountSettingLabel;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Email Settings'])[1]")
	WebElement emailSettingLabel;
	@FindBy(xpath = "//div[@data-cy='account-settings-table']")
	WebElement accountSettingTable;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Username'])[1]")
	WebElement usernameLabel;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Email Address'])[1]")
	WebElement emailAddressLabel;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Password'])[1]")
	WebElement passwordLabel;
	@FindBy(xpath = "//button[@data-cy='update-password-button']")
	WebElement updatePasswordButton;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Joined Simulator'])[1]")
	WebElement joinDateLabel;
	@FindBy(xpath = "//input[@id='input-198']")
	WebElement tradeConfirmationEmailsToggle;
	@FindBy(xpath = "(//a[@tabindex='0'])[7]")
	WebElement tradeStockLink;
	@FindBy(xpath = "(//a[@tabindex='0'])[8]")
	WebElement researchTheMarketLink;
	@FindBy(xpath = "(//a[@tabindex='0'])[9]")
	WebElement gotoPortfolioLink;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Back'])[1]")
	WebElement backButton;

	@FindBy(xpath = "(//span[@class='v-btn__content'])[4]")
	WebElement profileBtn;
	@FindBy(xpath = "//a[@data-cy='account-settings']")
	WebElement profileSettingButton;


	public _4_ProfileSettingPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyURL() {
		logger = report.createTest("Test Case 1: Verify 'URL' is displayed on the webpage");
		logger.log(Status.INFO, "URL of webpage is available");
		logger.log(Status.PASS, "URL is verified");
		return driver.getCurrentUrl();
	}

	public String verifyTitle() throws InterruptedException {
		logger = report.createTest("Test Case 2: Verify 'Title' is displayed on the webpage");
		logger.log(Status.INFO, "Title of webpage is available");
		logger.log(Status.PASS, "Title is verified");
		Thread.sleep(3000);
		return driver.getTitle();
	}

	public Boolean verifyAccountInformationLabel() {
		logger = report.createTest("Test Case 3: Verify 'Account Information' label is displayed");
		if (accountSettingLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Account Information' label is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Account Information' label is not displayed");
			return false;
		}
	}

	public Boolean verifyEmailSettingLabel() {
		logger = report.createTest("Test Case 4: Verify 'Email Setting' label is displayed");
		if (emailSettingLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Email Setting' label is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Email Setting' label is not displayed");
			return false;
		}
	}

	public Boolean verifyUsernameLabel() {
		logger = report.createTest("Test Case 5: Verify 'Username' label is displayed");
		if (usernameLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Username ' label is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Username Setting' label is not displayed");
			return false;
		}
	}

	public Boolean verifyEmailAddressLabel() {
		logger = report.createTest("Test Case 6: Verify 'Email Address' label is displayed");
		if (emailAddressLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Email Address ' label is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Email Address' label is not displayed");
			return false;
		}
	}

	public Boolean verifyPasswordLabel() {
		logger = report.createTest("Test Case 7: Verify 'Password' label is displayed");
		if (passwordLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Password ' label is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Password' label is not displayed");
			return false;
		}
	}

	public Boolean verifyUpdatePasswordButton() {
		logger = report.createTest("Test Case 8: Verify 'Update Password' label is displayed");
		if (updatePasswordButton.isDisplayed()) {
			logger.log(Status.PASS, "'Update Password ' button is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Update Password' button is not displayed");
			return false;
		}
	}

	public Boolean verifyJoinDateLabel() {
		logger = report.createTest("Test Case 9: Verify 'Join Date' label is displayed");
		if (joinDateLabel.isDisplayed()) {
			logger.log(Status.PASS, "'Join Date ' button is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Join Date' button is not displayed");
			return false;
		}
	}

	public Boolean verifyTradeConfirmationEmailsToggle() {
		logger = report.createTest("Test Case 10: Verify 'Trade Confirmation Emails' toggle is enabled");
		if (tradeConfirmationEmailsToggle.isEnabled()) {
			logger.log(Status.PASS, "'Trade Confirmation Emails ' toggle is enabled");
			return true;
		} else {
			logger.log(Status.FAIL, "'Trade Confirmation Emails' toggle is disabled");
			return false;
		}
	}

	public Boolean verifyTradeStockLink() {
		logger = report.createTest("Test Case 11: Verify 'Trade Stock' link is displayed ");
		if (tradeStockLink.isDisplayed()) {
			logger.log(Status.PASS, "'Trade Stock ' link is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Trade Stock' link is not displayed");
			return false;
		}
	}

	public Boolean verifyResearchTheMarketLink() {
		logger = report.createTest("Test Case 12: Verify 'Research The Market' link is displayed ");
		if (researchTheMarketLink.isDisplayed()) {
			logger.log(Status.PASS, "'Research The Market ' link is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Research The Market' link is not displayed");
			return false;
		}
	}

	public Boolean verifyGotoPortfolioLink() {
		logger = report.createTest("Test Case 13: Verify 'Portfolio Link' link is displayed ");
		if (gotoPortfolioLink.isDisplayed()) {
			logger.log(Status.PASS, "'Portfolio Link ' link is displayed");
			return true;
		} else {
			logger.log(Status.FAIL, "'Portfolio Link' link is not displayed");
			return false;
		}
	}

	public String verifyUserGotoBackProfile() {
		logger = report.createTest("Test Case 14: Verify 'Portfolio Page' is opened after clicking 'Back' button");
		logger.log(Status.INFO, "Clicking on 'Back' button");
		backButton.click();
		String title = driver.getTitle();
		if (title.contains("portfolio")) {
			logger.log(Status.PASS, "'Portfolio Page' is displayed successfully");
		} else {
			logger.log(Status.FAIL, "'Portfolio Page' was not displayed");
		}
		return title;
	}


}
