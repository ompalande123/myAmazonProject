package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	// This page class have 3 main parts
	// 1. Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// use of PageFactory - No need to write driver object to locate the elements.
		// We can use @FindBy annotation to locate the elements
	}

	// 2. Locators
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signIn;

	@FindBy(xpath = "//a[normalize-space()='Amazon Pay']")
	WebElement link_AmazonPay;

	@FindBy(xpath = "//span[@class='currency-green']")
	WebElement amazonPayBalance;

	// 3. Action Methods
	public WebElement clickSignIn() {
		return signIn;
	}

	public WebElement clickAmazonPay() {
		return link_AmazonPay;
	}

	public WebElement amazonPayBalance() {
		return amazonPayBalance;
	}

}
