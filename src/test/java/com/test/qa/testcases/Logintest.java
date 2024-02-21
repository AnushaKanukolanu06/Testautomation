package com.test.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.qa.base.BaseTest;
import com.test.qa.pages.Homepage;
import com.test.qa.pages.Login;

public class Logintest extends BaseTest{
	Login login;
	Homepage homepage;
	
	public Logintest() throws Throwable {
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		login = new Login();
		homepage = new Homepage();
	}
	@Test
	public void loginpagetest() throws Throwable {
		homepage = login.Verifylogin();
	}
	@AfterMethod
	public void quit() {
		//driver.close();
	}
	

}
