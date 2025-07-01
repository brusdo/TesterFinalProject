@regression

Feature: Log out

  Background:
    Given the user is on the Swag Labs login page
    When the user enters valid username and password
    And the user clicks the Login button
    Then the user should be redirected to the Product Listing page

  Scenario: User is logged out and redirected to the Login page
    When the user clicks the menu button
    And the user select Logout from the options
    Then the user should be taken to the Login page
