package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.ExtentReporter;
import Utility.ReadFileData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    public static ExtentReports report = ExtentReporter.getExtentReport();
    public static ExtentTest logger;

    public static WebDriver driver;

    public static  WebDriverWait wait;

    public static void initialization() {

        try {
            String browser = ReadFileData.getConfigFileData("Browser");
            String url = ReadFileData.getConfigFileData("URL");

            switch (browser) {
                case "Chrome":
                    WebDriverManager.chromiumdriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    /*options.addArguments("--headless");*/
                    options.addArguments("--disable-popup-blocking");
                    options.addArguments("--disable-notifications");
                    driver = new ChromeDriver(options);
                    wait = new WebDriverWait(driver,Duration.ofMillis(9000));
                    break;

                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "Safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
