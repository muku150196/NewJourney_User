
#Background:Given the user has logged into CRM management application
Feature: Add New CRM User

  Scenario: Add new user with valid data
  Given the user has logged into CRM management application
    When user clicks on CRM Management>>Users
     #And User Clicks "+" icon to add Users
    When the user enters Name and other details from Excel "<row_index>"
    And the user selects Role as Admin
    And the user selects Branch as Delhi
   And the user choose Status  as Active
   And the user clicks   on Check all
    And the user clicks on Submit
   # Then the user should see confirmation of successful user creation
    
     Examples: 
      | row_index|
      |         1|
      |         2|
      |         3|
      |         4|
      |         5|
     

    
 
    

    
    
 
