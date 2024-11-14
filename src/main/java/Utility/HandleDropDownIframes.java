package Utility;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownIframes extends TestBase {

    public static void getSelectClass(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static Actions getActionClass(){
		return new Actions(driver);
    }
}
