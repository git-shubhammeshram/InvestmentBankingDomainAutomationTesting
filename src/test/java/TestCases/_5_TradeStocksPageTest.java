package TestCases;

import Base.TestBase;
import Pages._1_HomePage;
import Pages._2_LoginPage;
import Pages._3_PortfolioPage;
import Pages._5_TradeStocksPage;
import Utility.CaptureScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class _5_TradeStocksPageTest extends TestBase {

    _5_TradeStocksPage tradeStocksPage;

    @BeforeMethod(alwaysRun = true)
    public void init() throws IOException, InterruptedException {
        initialization();
        _1_HomePage home = new _1_HomePage();
        home.clickLoginButton();

        _2_LoginPage login = new _2_LoginPage();
        login.verifyLoginToApplication();

        login.ClickTradeButton();

        tradeStocksPage = new _5_TradeStocksPage();
    }


    @Test
    public void verifyURLTest() throws InterruptedException {
        String expResult = "https://www.investopedia.com/simulator/trade/stocks";
        String actResult = tradeStocksPage.verifyURL();

        Assert.assertEquals(expResult,actResult);
        Reporter.log("URL is available on webpage:- "+actResult);
    }

    @Test(enabled = false)
    public void verifyTitleTest() throws InterruptedException{
        String expResult = "Investopedia Trading Game - Stocks";
        String actResult = tradeStocksPage.verifyTitle();

        Assert.assertEquals(expResult, actResult);
        Reporter.log("Title shown in the webpage:- " + actResult);
    }

    @Test
    public void verifySymbolLabel() {
        Boolean actResult = tradeStocksPage.verifySymbolLabel();
        Assert.assertTrue(actResult);
        Reporter.log("Symbol label is shown: " + true);
    }

    @Test
    public void verifyStockLabelLinkTest() {
        boolean actResult = tradeStocksPage.verifyStockLabelLink();

        Assert.assertTrue(actResult);
        Reporter.log("Stock label is linked: " + true);
    }

    @Test
    public void verifyUserBuyStockTest() throws InterruptedException, IOException {
        String expResult = "https://www.investopedia.com/simulator/trade/confirm";
        String actResult = tradeStocksPage.verifyUserBuyStock();

        Assert.assertEquals(expResult, actResult);
        Reporter.log("Url is available on webpage:- " + actResult);
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
