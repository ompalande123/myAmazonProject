Step 1:
Create a maven project

Step 2:
Add required dependecies in pom.xml
selenium-java
cucumber-java
cucumber-testng
testng

Step 3:
Create DriverFactory class under utilities package
- This will initialize a common driver for our tests
- Define getDriver() and quitDriver() methods
- getDriver() will start the chrome driver
- quitDriver() will close the browser


Step 4: Create Page classes under pages package
- Here, we have created 2 page classes
1) HomePage.java
2) LoginPage.java

- Need to create following things in Page classes
i. Create WebDriver object driver
ii. make a parameterized costructor for WebDriver
iii. create PageFactory class initElements for driver (one time setup)
iv. Write locators using @FindBy annotation
v. Write action methods

Step 5: Create a feature file under scenarios package/folder and add required scenarios
- Feature files have .feature extenstion
- created login.feature file
- Added one login scenario using Gherkin keywords(given, when, then)


Step 6: created LoginSteps class under stepDefinitions package to handle steps from feature file
- Create page objects which are needed.
e.g. LoginPage loginPage;
- Create constructor to get load the driver from DriverFactory class
- We can assign driver from DriverFactory to page objects.
- Now, we can write actual code to test the functionality under respective step.
- Add validations as well

Step 7: Created PropertiesManager class under utilities package
- This class is created to maintain a separate config.properties file so that values not hardcoded.
- We can access static methods from PropertiesManager and fetch the required values.









