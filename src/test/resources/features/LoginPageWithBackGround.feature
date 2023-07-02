@Login11
Feature: This feature is to test login page scenarios with background keyword

Background: 
		Given user launches OrangeHRM page
    Then validate user is on login page

  @TC11 @Testing11
  Scenario: Validate OrangeHRM with valid credentials
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM

  @TC12
  Scenario: Validate OrangeHRM with valid credentials with parameters in feature line
    When user enters username as "Admin" and password "admin123" and clicks on login button
    #    When user enters "Admin" and "admin123" and clicks on login button
    Then user able to see home page of OrangeHRM

  @TC13 @validateLogin11
  Scenario Outline: Validate OrangeHRM with valid credentials with parameters in feature line
    When user enters username as <userName> and password <Password> and clicks on login button
    Then user able to see home page of OrangeHRM

    Examples: 
      | userName | Password   |
      | "Admin"  | "admin123" |
      | "Admin"  | "admin123" |

  @TC14 @validateLogin11
  Scenario Outline: Validate OrangeHRM login with invalid credentials
    When user enters username as <userName> and password <Password> and clicks on login button
    Then validate that user not able to login

    Examples: 
      | userName | Password   |
      | "Admin1" | "admin123" |
      | "Admin2" | "admin123" |
      | 'A'      | "admin123" |
