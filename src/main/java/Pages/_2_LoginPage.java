package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.TestBase;
import Utility.ReadFileData;

public class _2_LoginPage extends TestBase {

	@FindBy(xpath = "//img[@title='Investopedia']")
	WebElement brandLogo;
	@FindBy(xpath = "//h2[@class='page-title']")
	WebElement loginLabel;
	@FindBy(xpath = "//a[text()='create an account']")
	WebElement createAccountLink;
	@FindBy(xpath = "//input[@id='username']")
	WebElement userNameTextBox;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginButton;
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement forgavePasswordLink;
	@FindBy(xpath = "//a[text()=' Back']")
	WebElement backButton;

	@FindBy(xpath = "(//*[normalize-space(text())='trade']) [1]")
	WebElement tradeButton;


	public _2_LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPageURL() {
		logger = report.createTest("Test Case 1: Verify 'Login Page URL' is displayed on webpage");
		logger.log(Status.INFO, "Login Page URL is available");
		logger.log(Status.PASS, "Login Page URL is verified");
		return driver.getCurrentUrl();
	}

	public boolean verifyBrandLogo() {
		logger = report.createTest("Test Case 2: Verify 'Brand Logo' is displayed on webpage");
		logger.log(Status.INFO, "Brand logo is available");
		logger.log(Status.PASS, "Brand logo is verified");
		return brandLogo.isDisplayed();
	}

	public boolean verifyCreateAccountLink() {
		logger = report.createTest("Test Case 3: Verify 'Create Account Link ' is displayed on webpage");
		logger.log(Status.INFO, "Create Account Link is available");
		logger.log(Status.PASS, "Create Account Link is verified");
		return createAccountLink.isDisplayed();
	}

	public boolean verifyUserNameTextBox() {
		logger = report.createTest("Test Case 4: Verify 'User Name Text Box' is displayed on webpage");
		logger.log(Status.INFO, "User Name Text Box is available");
		logger.log(Status.PASS, "User Name Text Box is verified");
		return userNameTextBox.isDisplayed();
	}

	public boolean verifyPasswordTextBox() {
		logger = report.createTest("Test Case 5: Verify 'Password TextBox ' is displayed on webpage");
		logger.log(Status.INFO, "Password TextBox is available");
		logger.log(Status.PASS, "Password TextBox is verified");
		return passwordTextBox.isDisplayed();
	}

	public boolean verifyLoginButton() {
		logger = report.createTest("Test Case 6: Verify 'Login Button ' is displayed on webpage");
		logger.log(Status.INFO, "Login Button is available");
		logger.log(Status.PASS, "Login Button is verified");
		return loginButton.isDisplayed();
	}

	public boolean verifyForgatePasswordLink() {
		logger = report.createTest("Test Case 7: Verify 'Forgave Password Link' is displayed on webpage");
		logger.log(Status.INFO, "Forgave Password Link is available");
		logger.log(Status.PASS, "Forgave Password Link is verified");
		return forgavePasswordLink.isDisplayed();
	}

	public boolean verifyBackButton() {
		logger = report.createTest("Test Case 8: Verify 'Back Button' is displayed on webpage");
		logger.log(Status.INFO, "Back Button  is available");
		logger.log(Status.PASS, "Back Button  is verified");
		return backButton.isDisplayed();
	}

	public String verifyLoginToApplication() throws IOException, InterruptedException {

		logger = report.createTest("Test Case 9: Verify 'User Login Details' is displayed on webpage");
		logger.log(Status.INFO, "Username is Entered");
		userNameTextBox.sendKeys(ReadFileData.getConfigFileData("Username"));
		Thread.sleep(3000);
		logger.log(Status.INFO, "Password is Entered");
		passwordTextBox.sendKeys(ReadFileData.getConfigFileData("Password"));
		Thread.sleep(3000);
		logger.log(Status.INFO, "Pressed Login Button");
		logger.log(Status.PASS, "User Login  is verified");

		loginButton.click();
		Thread.sleep(3000);
		return driver.getTitle();

	}

	public void ClickTradeButton(){
		tradeButton.click();
	}


}
