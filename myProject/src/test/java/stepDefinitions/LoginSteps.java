package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory;
import utilities.ManageWaits;
import utilities.PropertiesManager;

public class LoginSteps {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	
	// constructor to load Original WebDriver from DriverFactory class so that same driver can be used for further testing
	public LoginSteps() {
		this.driver=DriverFactory.getDriver();
		loginPage=new LoginPage(DriverFactory.getDriver());
		homePage=new HomePage(DriverFactory.getDriver());
	}
	
	
	
	@Given("the user is on amazon home page")
	public void the_user_is_on_amazon_home_page()
	{
		try {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));;
//		driver.get("https://www.amazon.in/");
		driver.get(PropertiesManager.configProp().getProperty("appURL"));
		
		Assert.assertTrue(true, "Page loaded successfully within time");
		}catch (Exception e) {
			System.out.println("Page Load timeout exceeded"+e.getMessage());
			Assert.fail("Page load timeout issue occured"+e.getMessage());
		}
		
	}
	
	@When("user click on signIn button from home page")
	public void user_click_on_signIn_button_from_home_page()
	{
		ManageWaits.clickOnAfterVisible(driver, homePage.clickSignIn(), 20);
//		homePage.clickSignIn();
		
	}
	
	
	
    @And("user enters valid credentials")
    public void user_enters_valid_credentials() throws IOException
    {
//    	loginPage.setInputEmail(PropertiesManager.configProp().getProperty("email"));
    	ManageWaits.sendKeysAfterVisible(driver, loginPage.setInputEmail(), 10, PropertiesManager.configProp().getProperty("email"));
    	
//    	loginPage.clickContinue();
    	ManageWaits.clickOnAfterVisible(driver, loginPage.clickContinue(), 10);
    	
    	
//    	loginPage.setPassword(PropertiesManager.configProp().getProperty("pass"));
    	ManageWaits.sendKeysAfterVisible(driver, loginPage.setPassword(), 10, PropertiesManager.configProp().getProperty("pass"));
    	
    	
//    	loginPage.clickSignIn();
    	ManageWaits.clickOnAfterVisible(driver, loginPage.clickSignIn(), 10);
    	
    	
    }
    
    @Then("user is navigated to home page")
    public void user_in_navigated_to_home_page()
    {
    	
    	String actualTitle=driver.getTitle();
    	String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    	Assert.assertEquals(actualTitle, expectedTitle);
    }
    
        
    @And("user quits the browser") 
    public void user_quits_the_browser()
    {
    	DriverFactory.quitDriver();
    }
	
	

}
