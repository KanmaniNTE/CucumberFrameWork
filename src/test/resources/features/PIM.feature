Feature: This is to test PIM test cases

@PIM01
  Scenario: Validate PIM page
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM
#		Then user clicks on PIM menu
		When user clicks on "PIM" menu
		Then validate user is on "PIM" page
		