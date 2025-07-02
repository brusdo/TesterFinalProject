@login @regression
Feature: Swag Labs Login

  Scenario: Successful login with valid credentials
    Given the user is on the Swag Labs login page
    When the user enters valid username and password
    And the user clicks the Login button
    Then the user should be redirected to the Product Listing page

  Scenario: Unsuccessful login with both credentials invalid
    Given the user is on the Swag Labs login page
    When the user enters invalid username and password
    And the user clicks the Login button
    Then the user should see a login failed error message
    And the user should remain on the login page

  Scenario: Unsuccessful login with invalid username
    Given the user is on the Swag Labs login page
    When the user enters an invalid username
    And the user enters a valid password
    And the user clicks the Login button
    Then the user should see a login failed error message
    And the user should remain on the login page

  Scenario: Unsuccessful login with invalid password
    Given the user is on the Swag Labs login page
    When the user enters a valid username
    And the user enters an invalid password
    And the user clicks the Login button
    Then the user should see a login failed error message
    And the user should remain on the login page