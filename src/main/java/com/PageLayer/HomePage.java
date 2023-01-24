package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//div[@id='top-header-menu']")
	private WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public String captureTitle() {
		return driver.getTitle();
	}
	
	public String captureCurrentURL() {
		return driver.getCurrentUrl();
	}
}
