package com.test.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;

public class Login extends BaseTest{
	@FindBy(name="username")
	WebElement uname;
	@FindBy(name="password")
	WebElement pswd;
	@FindBy(id="submit")
	WebElement login;

	public Login() throws Throwable {
		super();
		PageFactory.initElements(driver,this);
	}
	public  Homepage Verifylogin() throws Throwable {
		uname.sendKeys(prop.getProperty("username"));
		pswd.sendKeys(prop.getProperty("password"));
		login.click();
		return new Homepage();
	}

}
