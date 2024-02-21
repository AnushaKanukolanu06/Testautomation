package com.test.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static Properties prop;    
	public static WebDriver driver;
	public BaseTest() throws Throwable {  
		 
		try {
			prop = new Properties();  
			
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Testautomation\\src\\main\\java\\com\\test\\qa\\config\\com.config.properties");
		      
			prop.load(file);  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() throws Throwable {   
		String browsername = prop.getProperty("browser");   
		if(browsername.equals("chrome")){
		driver = new ChromeDriver();
	}
	
	else if(browsername.equals("firefox")){
		driver = new FirefoxDriver();
	}
	else  {
		System.out.println("enter proper browser name ");
	}
		
		driver.manage().window().maximize();      
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get(prop.getProperty("url")); 
	}
	

}
