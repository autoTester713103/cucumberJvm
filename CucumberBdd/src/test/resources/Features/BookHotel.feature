@BookHotel
Feature: As a User I should be able to book a hotel

  @test1
  Scenario: Successful booking of hotel
    Given Navigate to Customer login Page
    	And I log in the Customer Page
    	| Email | Password |
    	| johndoe@test.te | test1234 |
    When I book a room in the 'Grand Bahama, BS' location and '1-28 Feb 2020' duration
    Then I should see the payment page