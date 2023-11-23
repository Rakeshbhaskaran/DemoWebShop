package com.ff.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement DemoWebShopLogo;
	
	@FindBy(className="ico-register")
	private WebElement RegisterLink;
	
	@FindBy(className="ico-login")
	private WebElement LoginLink;
	
	
	
	
	
}
