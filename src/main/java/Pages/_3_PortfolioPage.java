package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Base.TestBase;

public class _3_PortfolioPage extends TestBase {

	@FindBy(xpath = "//img[@class='mr-3']")
	WebElement portfolioLogo;
	@FindBy(xpath = "(//*[normalize-space(text()) = 'Investopedia Trading Game'])[1]")
	WebElement investopediaTradingGameLabel;
	@FindBy(xpath = "(//span[@class='v-btn__content'])[4]")
	WebElement profileBtn;
	@FindBy(xpath = "//div[@data-cy='portfolio-summary']")
	WebElement overviewChart;
	@FindBy(xpath = "//div[@data-cy='game-info']")
	WebElement gameInfoChart;
	@FindBy(xpath = "//div[@data-cy='portfolio-holdings']")
	WebElement holdingChart;
	@FindBy(xpath = "//a[@data-cy='account-settings']")
	WebElement profileSettingButton;

	public _3_PortfolioPage() {
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

	public boolean verifyPortfolioLogo() {
		logger = report.createTest("Test Case 3: Verify 'Portfolio Logo' is displayed on the webpage");
		logger.log(Status.INFO, "Logo of webpage is available");
		logger.log(Status.PASS, "Logo is verified");
		return portfolioLogo.isDisplayed();
	}

	public boolean verifyInvestopediaTradingGameLabel() {
		logger = report.createTest("Test Case 4: Verify 'Investopedia Trading Game Liable' is displayed on the webpage");
		logger.log(Status.INFO, "Lable of webpage is available");
		logger.log(Status.PASS, "Lable is verfied");
		return investopediaTradingGameLabel.isDisplayed();
	}

	public boolean verifyGameInfoChart() {
		logger = report.createTest("Test Case 5: Verify 'Game Info Chart' is displayed on the webpage");
		logger.log(Status.INFO, "Game Info Chart of webpage is available");
		logger.log(Status.PASS, "Game Info Chart is verified");
		return gameInfoChart.isDisplayed();
	}

	public boolean verifyHoldingChart() {
		logger = report.createTest("Test Case 6: Verify 'Holding Chart' is displayed on the webpage");
		logger.log(Status.INFO, "Holding Chart of webpage is available");
		logger.log(Status.PASS, "Holding Chart is verified");
		return holdingChart.isDisplayed();
	}

	public boolean verifyOverviewChart() {
		logger = report.createTest("Test Case 7: Verify 'Overview Chart' is displayed on the webpage");
		logger.log(Status.INFO, "Overview Chart of webpage is available");
		logger.log(Status.PASS, "Overview Chart is verified");
		return overviewChart.isDisplayed();
	}

	public String verifyUserProfile() throws InterruptedException {
		logger = report.createTest("Test Case 8: Verify 'User Profile' is displayed on the webpage");
		logger.log(Status.INFO, "Clicked on Profile button");
		Thread.sleep(3000);
		profileBtn.click();
		logger.log(Status.INFO, "Clicked on Setting button");
		Thread.sleep(3000);
		profileSettingButton.click();
		logger.log(Status.PASS, "User is able to open the profile");
		Thread.sleep(3000);
		return driver.getTitle();
	}

}
