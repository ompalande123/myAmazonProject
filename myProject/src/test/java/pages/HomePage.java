package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	WebDriver driver;
	
	// This page class have 3 main parts
	//1. Constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//2. Locators
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") 
	WebElement signIn;
	
	
	
	
	
	//3. Action Methods
	public WebElement clickSignIn()
	{
		return signIn;
	}
	
	
	
	
}
