@CreateCustomer
Feature: As an Admin I should be able to create a customer
	
  @CreateCustomer1
  Scenario: Successful creation of customer 2
    Given I log in the Admin Page
    	And I navigate to customer management
    	And I click Add Customer
    When I create a customer
    | First Name | Last Name | Email | Password | Country |
    | John | Doe2 | johndoe@test.te | test1234 | Phillipines |
    Then I should see the customer created
    | First Name | Last Name | Email |
    | John | Doe | johndoe@test.te |
		# And I logout of the Admin Page