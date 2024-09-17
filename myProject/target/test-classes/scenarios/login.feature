
Feature: Login Feature
  This is my login feature file

  @Valid_login
  Scenario: Login with valid credentials
    Given the user is on amazon home page
    When user click on signIn button from home page
    And user enters valid credentials
    Then user is navigated to home page
    And user quits the browser

	@Check_Amazon_Pay_Balance
	Scenario: User wants to check amazon pay balance
	Given the user is on amazon home page
	When user click on signIn button from home page
  And user enters valid credentials
  Then user is navigated to home page
  And user clicks on Amazon Pay option from menu bar
  And user checks the balance
  Then user quits the browser
    