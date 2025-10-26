Feature: PAN verification 

  Scenario: User enters and verify PAN details
  Given the user has logged into CRM management application
    When user clicks on CRM Management>>Logins
    Then User Lands To CRM/Logins Page
    When user Enters Name in SerchBYName field from Excel "<row_index>"
    And user clicks Serch Button
    Then data with mathing name should be filtered
    When User clicks Clear Button
    Then SearchByName field should be cleared and all data should be displayed
    
     Examples: 
      | row_index|
      |         |
     

    
 
    

    
    
 
