package com.test.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.test.qa.base.BaseTest;
import com.test.qa.pages.Homepage;
import com.test.qa.pages.Login;
import com.test.qa.utils.Utils; 

public class Homepagetest extends  BaseTest{
	Login login;
	Homepage homepage;
	static String snameexcel = "Sheet1";

	public Homepagetest() throws Throwable {
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		login = new Login();
		homepage = new Homepage();
		homepage = login.Verifylogin();
	}
	@DataProvider
	public Object[][] Exceldata() {
		Object[][] data =Utils.getExcelData(snameexcel);
		return data;
	}
	@Test(dataProvider = "Exceldata")
	public void homepagetest(String fullname,String lname,String emailid,String comment) throws Throwable {
		homepage = homepage.VerifyHPage(fullname,lname,emailid,comment);
	}
	@AfterMethod
	public void quit() {
		//driver.close();
	}

}
