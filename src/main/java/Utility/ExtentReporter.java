package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter {

    public static ExtentReports report;

    public static ExtentReports getExtentReport() {

        if (report == null) {

            String reportName = getFormattedDate();

            ExtentHtmlReporter reportPathFile = new ExtentHtmlReporter("D:\\SoftwereTesting\\Projects\\InvestmentBanking-Domain\\ExtentReporter\\" + reportName + ".html");

            report = new ExtentReports();
            report.attachReporter(reportPathFile);

            /* SetSystemInformation */
            report.setSystemInfo("OS", "Windows");
            report.setSystemInfo("ENVIRONMENT", "Development");
            report.setSystemInfo("BUILD NUMBER", "0.0.1Snapshots");
            report.setSystemInfo("BROWSER", "Chrome");

            /* Configure report settings */
            reportPathFile.config().setDocumentTitle("UI Automation");
            reportPathFile.config().setReportName("UI Test Report");
        }

        return report;
    }

    private static String getFormattedDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        Date date = new Date();

        return "Extent Report Dated - " + format.format(date);
    }

}
