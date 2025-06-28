
Feature: Add item to cart

  Background:
    Given the user is on the Swag Labs login page
    When the user enters valid username and password
    And the user clicks the Login button
    Then the user should be redirected to the Product Listing page

  Scenario: Add a single item to the cart
    Given I am on the products page
    When I click on "Add to cart" for a product
    Then the shopping cart icon will display "1" inside a red circle
    And the product will appear in the "Your Cart" page
