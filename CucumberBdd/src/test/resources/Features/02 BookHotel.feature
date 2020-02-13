@BookHotel
Feature: As a User I should be able to book a hotel

  @test1
  Scenario: Successful booking of hotel
    Given I log in the Customer Page
	| url | Email | Password |
    | https://www.phptravels.net/login | johndoe@test.te | test1234 |
    	And I navigate to "Home Page"
    	And I open the chat widget
    	And I log in to chat
    	| name | email | subject | message |
    	| John Doe | johndoe@test.te | test subject | test message |
    	And I navigate to "Home Page"
    When I search for a hotel
    | location | checkin | checkout |
    | Grand Bahama |1-2-2020 | 28-2-2020 |
    	And I see results
    	And I book a room
    Then I should see the payment page
    	And I navigate to "Logout"