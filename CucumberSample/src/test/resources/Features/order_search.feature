@ordersearch
Feature: As a User I should be able to add an item to the customer's cart

  @test
  Scenario: Successful add item to cart
    Given I am on the Item Details Page of 'Cucumber'
    And I have already selected fulfilment 'STH'
    When I Add the item to the cart
    And I have selected customer 'Ralph'
    Then I should see the "Cucumber" in the cart

  Scenario: Unsuccessful add item to cart no selected customer
    Given I am on the Item Details Page of 'Cucumber'
    And I have already selected a fulfilment 'BOSS'
    When I Add the item to the cart
    But I have not selected a customer
    Then I should see the customer search modal

  Scenario: Unsuccessful add item to cart no selected fulfilment
    Given I am on the Item Details Page of 'Cucumber'
    And I have not selected a fulfilment
    When I Add the item to the cart
    And I have already selected a customer 'Paulo'
    Then I should see the notification error message
