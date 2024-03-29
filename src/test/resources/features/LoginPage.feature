@Login
Feature: This feature is to test login page scenarios

  @TC01 @Testing01
  Scenario: Validate OrangeHRM with valid credentials
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM

  @TC02
  Scenario: Validate OrangeHRM with valid credentials with parameters in feature line
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username as "Admin" and password "admin123" and clicks on login button
    #    When user enters "Admin" and "admin123" and clicks on login button
    Then user able to see home page of OrangeHRM

  @TC03 @validateLogin
  Scenario Outline: Validate OrangeHRM with valid credentials with parameters in feature line
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username as <userName> and password <Password> and clicks on login button
    Then user able to see home page of OrangeHRM

    Examples: 
      | userName | Password   |
      | "Admin"  | "admin123" |
      | "Admin"  | "admin123" |

  @TC04 @validateLogin
  Scenario Outline: Validate OrangeHRM login with invalid credentials
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username as <userName> and password <Password> and clicks on login button
    Then validate that user not able to login

    Examples: 
      | userName | Password   |
      | "Admin1" | "admin123" |
      | "Admin2" | "admin123" |
      | 'A'      | "admin123" |
