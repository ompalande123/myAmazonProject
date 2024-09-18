package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Locators
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement inputEmail;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement inputPswd;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement btnSignIn;

	// Action methods
	public WebElement setInputEmail() {
		return inputEmail;

	}

	public WebElement clickContinue() {
		return btnContinue;
	}

	public WebElement setPassword() {
		return inputPswd;
	}

	public WebElement clickSignIn() {
		return btnSignIn;
	}

}
