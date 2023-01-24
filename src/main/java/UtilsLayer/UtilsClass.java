package UtilsLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class UtilsClass  extends BaseClass {
	
	public static void enterValues(WebElement wb,  String str) {
		if((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.sendKeys(str);
		}
	}

	
	public static void clickonElement(WebElement wb) {
		if((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.click();
		}
	}
}
