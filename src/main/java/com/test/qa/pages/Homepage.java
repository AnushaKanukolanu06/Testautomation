package com.test.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.BaseTest;

public class Homepage extends BaseTest {
	@FindBy(id="menu-item-18")
	WebElement contact;
	@FindBy(name="wpforms[fields][0][first]")
	WebElement name;
	@FindBy(name="wpforms[fields][0][last]")
	WebElement lname;
	@FindBy(name="wpforms[fields][1]")
	WebElement email;
	@FindBy(name="wpforms[fields][2]")
	WebElement comment;
//	@FindBy(xpath="//div[@class='recaptcha-checkbox-checkmark']")
//	WebElement captcha;

	public Homepage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	public Homepage VerifyHPage(String fullname,String last, String emailid,String comment) throws Throwable {
		contact.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(100, 500)");
    	this.name.sendKeys(fullname);
    	this.lname.sendKeys(last);
    	this.email.sendKeys(emailid);
    	this.comment.sendKeys(comment);
    	//captcha.click(); 
		return new Homepage();
	}

}
