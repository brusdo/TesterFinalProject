
Feature: Checkout

  Background:
    Given the user is on the Swag Labs login page
    When the user enters valid username and password
    And the user clicks the Login button
    Then the user should be redirected to the Product Listing page

  Scenario: Initiate the checkout process from the cart page
    Given the user adds items to their cart
    And the user navigates to the cart page
    And the user verifies they have 1 or more items in my cart
    When the user clicks the "Checkout" button on the cart page
    Then the user is prompted to enter their personal information
    And the user should be on the checkout page
