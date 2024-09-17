package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.DriverFactory;
import utilities.ManageWaits;

public class HomePageSteps {

	private WebDriver driver;
	
	private HomePage homePage;
	
	public HomePageSteps()
	{
		this.driver=DriverFactory.getDriver();
		homePage=new HomePage(DriverFactory.getDriver());
	}
	
	
	@And("user clicks on Amazon Pay option from menu bar")
	public void user_clicks_on_amazon_pay()
	{
		ManageWaits.clickOnAfterVisible(driver, homePage.clickAmazonPay(), 10);
	}
	
	
	@And("user checks the balance")
	public void user_checks_the_balance()
	{
		ManageWaits.isVisible(driver, homePage.amazonPayBalance(), 10);
		String myBalance=homePage.amazonPayBalance().getText();
		System.out.println("My balance = "+myBalance);
	
	}
	
	
	
	
}
