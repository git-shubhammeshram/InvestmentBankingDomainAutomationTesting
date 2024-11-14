package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenshot extends TestBase {

	public static void getScreenshot(String fileName) throws IOException {

		String fileExtension = getFormattedDateFile();

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\SoftwereTesting\\Projects\\InvestmentBanking-Domain\\Screenshots\\" + fileName
				+ fileExtension + ".png");
		FileHandler.copy(source, des);
	}

	public static String getFormattedDateFile() {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date date = new Date();
        return " Screenshot Captured On Dated- " + format.format(date);

	}

}
