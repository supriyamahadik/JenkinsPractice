package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement Uname;
	@FindBy(name="password")
	private WebElement Pass;
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginPagefun(String username, String password) {
		UtilsClass.enterValues(Uname, username);
		UtilsClass.enterValues(Pass, password);
		UtilsClass.clickonElement(loginButton);
	}
}