package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.DriverFactory;
import utilities.ManageWaits;
import utilities.PropertiesManager;

public class HomePageSteps {

	private WebDriver driver;

	private HomePage homePage;

	private long timeout;

	public HomePageSteps() throws IOException {
		this.driver = DriverFactory.getDriver();
		homePage = new HomePage(DriverFactory.getDriver());

		String strTimeout = PropertiesManager.configProp().getProperty("timeout");
		this.timeout = Long.valueOf(strTimeout);
	}

	@And("user selects amazon pay option from from dashboard")
	public void user_selects_amazonPay_option() {
		ManageWaits.clickOnAfterVisible(driver, homePage.clickAmazonPay(), timeout);
	}

	@And("user checks the balance")
	public void user_checks_the_balance() {
		ManageWaits.isVisible(driver, homePage.amazonPayBalance(), timeout);

	}

}
