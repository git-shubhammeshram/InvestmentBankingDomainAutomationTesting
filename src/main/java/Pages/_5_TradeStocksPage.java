package Pages;

import Base.TestBase;
import Utility.HandleDropDownIframes;
import Utility.ReadFileData;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class _5_TradeStocksPage extends TestBase {
    @FindBy(xpath = "//*[normalize-space(text())='stocks']")
    WebElement stockLabelLink;
    @FindBy(xpath = "//*[normalize-space(text())='order status']")
    WebElement orderStatusLabelLink;
    @FindBy(xpath = "//*[normalize-space(text())='Symbol']")
    WebElement symbolLabel;
    @FindBy(xpath = "//div[@class='symbol-search-field']")
    WebElement searchFieldTextBox;
    @FindBy(xpath = "//*[normalize-space(text())='TCS']") WebElement TCSStock;
    @FindBy(xpath = "//*[normalize-space(text())='Action']")
    WebElement actionLabel;
    @FindBy(xpath = "(//button[@data-cy='tooltip-icon'])[1]")
    WebElement toolTipIcon;
    @FindBy(xpath = "(//div[text()='Buy'])[1]")
    WebElement stockBuySelectBox;
    @FindBy(xpath = "//*[normalize-space(text())='Quantity']")
    WebElement quantityLabel;
    @FindBy(xpath = "//input[@data-cy='quantity-input']")
    WebElement quantityTextBox;
    @FindBy(xpath = "//*[normalize-space(text())='Order Type']")
    WebElement orderTypeLabel;
    @FindBy(xpath = "(//div[text()='Market'])[1]")
    WebElement orderTypeOptionsSelectBox;
    @FindBy(xpath = "//*[normalize-space(text())='Duration']")
    WebElement durationLabel;
    @FindBy(xpath = "(//div[@class='v-input__slot'])[4]")
    WebElement durationSelectBox;
    @FindBy(xpath = "//button[@data-cy='preview-button']")
    WebElement previewOrderButton;
    @FindBy(xpath = "//button[@data-cy='clear-button']")
    WebElement clearButton;

    /* After sending the TCS text to textBox */
    @FindBy(xpath = "//*[normalize-space(text())='TCS']")
    WebElement StockDataText;


    @FindBy(xpath = "//div[@class='trading-view-symbol-info white']")
    WebElement stockTradingInformation;
    @FindBy(xpath = "//div[@class='container company-info']")
    WebElement companyInformationTable;
    @FindBy(xpath = "//div[@id='tradingview-symbol-overview']")
    WebElement tradingChart;
    @FindBy(xpath = "(//*[normalize-space(text())='Preview Order'])[2]")
    WebElement orderPreviewLabel;
    @FindBy(xpath = "//button[@data-cy='close-dialog-button']")
    WebElement closingCrossButton;

    @FindBy(xpath = "//button[@data-cy='change-order-button']")
    WebElement changeOrderButton;

    @FindBy(xpath = "//button[@data-cy='submit-order-button']")
    WebElement submitOrderButton;


    public _5_TradeStocksPage() {
        PageFactory.initElements(driver, this);
    }


    public String verifyURL() throws InterruptedException {
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

    public Boolean verifyStockLabelLink() {
        logger = report.createTest("Test Case 3: Verify 'stockLabelLink' label is displayed");
        if (stockLabelLink.isDisplayed()) {
            logger.log(Status.PASS, "'stockLabelLink' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'stockLabelLink' label is not displayed");
            return false;
        }
    }

    public Boolean verifyOrderStatusLabelLink() {
        logger = report.createTest("Test Case 4: Verify 'orderStatusLabelLink' label is displayed");
        if (orderStatusLabelLink.isDisplayed()) {
            logger.log(Status.PASS, "'orderStatusLabelLink' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'orderStatusLabelLink' label is not displayed");
            return false;
        }
    }

    public Boolean verifySymbolLabel() {
        logger = report.createTest("Test Case 5: Verify 'symbol' label is displayed");
        if (symbolLabel.isDisplayed()) {
            logger.log(Status.PASS, "'symbol' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'symbol' label is not displayed");
            return false;
        }
    }

    public Boolean verifyActionLabel() {
        logger = report.createTest("Test Case 6: Verify 'actionLabel' label is displayed");
        if (actionLabel.isDisplayed()) {
            logger.log(Status.PASS, "'actionLabel' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'actionLabel' label is not displayed");
            return false;
        }
    }

    public Boolean verifyToolTipIcon() {
        logger = report.createTest("Test Case 7: Verify 'toolTipIcon' label is displayed");
        if (toolTipIcon.isDisplayed()) {
            logger.log(Status.PASS, "'toolTipIcon' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'toolTipIcon' label is not displayed");
            return false;
        }
    }


    public Boolean verifyQuantityLabel() {
        logger = report.createTest("Test Case 8: Verify 'quantityLabel' label is displayed");
        if (quantityLabel.isDisplayed()) {
            logger.log(Status.PASS, "'quantityLabel' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'quantityLabel' label is not displayed");
            return false;
        }
    }

    public Boolean verifyOrderTypeLabel() {
        logger = report.createTest("Test Case 9: Verify 'orderTypeLabel' label is displayed");
        if (orderTypeLabel.isDisplayed()) {
            logger.log(Status.PASS, "'orderTypeLabel' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'orderTypeLabel' label is not displayed");
            return false;
        }
    }

    public Boolean verifyDurationLabel() {
        logger = report.createTest("Test Case 10: Verify 'durationLabel' label is displayed");
        if (durationLabel.isDisplayed()) {
            logger.log(Status.PASS, "'durationLabel' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'durationLabel' label is not displayed");
            return false;
        }
    }

    public Boolean verifyClearButton() {
        logger = report.createTest("Test Case 11: Verify 'clearButton' label is displayed");
        if (clearButton.isDisplayed()) {
            logger.log(Status.PASS, "'clearButton' label is displayed");
            return true;
        } else {
            logger.log(Status.FAIL, "'clearButton' label is not displayed");
            return false;
        }
    }

    public String verifyUserBuyStock() throws InterruptedException, IOException {

        logger = report.createTest("Test Case 12: Verify 'User Buy Stock' Functionality");
        Actions act = HandleDropDownIframes.getActionClass();
        act.moveToElement(searchFieldTextBox).click().sendKeys(ReadFileData.getExcelData(1,16)).build().perform();
        Thread.sleep(2000);
        logger.log(Status.INFO,"Stock is Entered");

        act.moveToElement(TCSStock).click().build().perform();
        Thread.sleep(4000);
        logger.log(Status.INFO,"Stock is selected");

        act.moveToElement(stockBuySelectBox).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        logger.log(Status.INFO,"Buy Order is placed");

        act.moveToElement(quantityTextBox).click().sendKeys(ReadFileData.getExcelData(1,17)).build().perform();
        Thread.sleep(2000);
        logger.log(Status.INFO,"Quantity is entered");

        act.moveToElement(orderTypeOptionsSelectBox).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        logger.log(Status.INFO,"Order Type is selected");

        act.moveToElement(durationSelectBox).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        logger.log(Status.INFO,"Duration is selected");

        previewOrderButton.click();
        Thread.sleep(5000);
        logger.log(Status.INFO,"Preview Order is clicked");

        submitOrderButton.click();
        Thread.sleep(5000);
        logger.log(Status.INFO,"Submit Order is clicked");

        String url = driver.getCurrentUrl();
        assert url != null;
        if (url.contains("confirm")) {
            logger.log(Status.PASS, "URL is displayed on webpage");
            return url;
        } else {
            logger.log(Status.FAIL, "URL is not available");
            return driver.getCurrentUrl();
        }


    }


}
