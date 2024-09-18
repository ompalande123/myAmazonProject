Feature: Login tests
  This is login feature file to track login related scenarios

  @valid_user
  Scenario: with valid credentials
    Given user is navigated to amazon home page
    And user clicks on signIn button
    And user entered valid username "ompalande123@gmail.com" and password "Nevergiveup@2024"
    And user clicked on submit button
    And user is logged in successfully on dashboard page

  @check_amazon_pay_balance
  Scenario: user wants to check pay balance
    Given user is navigated to amazon home page
    And user clicks on signIn button
    And user entered valid username "ompalande123@gmail.com" and password "Nevergiveup@2024"
    And user clicked on submit button
    And user is logged in successfully on dashboard page
    And user selects amazon pay option from from dashboard
    And user checks the balance
