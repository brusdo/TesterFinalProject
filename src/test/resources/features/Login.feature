@login
Feature: Swag Labs Login

  Scenario: Successful login with valid credentials
    Given the user is on the Swag Labs login page
    When the user enters valid username and password
    And the user clicks the Login button
    Then the user should be redirected to the Product Listing page