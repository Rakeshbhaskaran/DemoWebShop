package com.ff.webdriverUtility;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
	}
	
	@BeforeClass 
	public static void Login() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
	}
	

}
