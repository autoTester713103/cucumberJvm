@restaurantsearch
Feature: As a User I should be able to search for restaurants

  @test1
  Scenario: Successful search of restaurants
    Given I am on the Homepage
    When I search for restaurant 'Yellow Cab'
    Then I should see a list of restaurants related to 'Yellow Cab'

  @test2
  Scenario: Unsuccessful search of restaurants using non-existing restaurants
    Given I am on the Homepage
    When I search for restaurant '...'
    Then I should see an error message

  @test3
  Scenario: List of search suggestions
    Given I am on the Homepage
    When I type search term 'Ye'
    Then I should see a list of search suggestions related to 'Ye'
