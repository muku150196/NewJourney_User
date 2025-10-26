Feature: CRM Management Testing

  Scenario: CRMManagement
    Given the user has logged into CRM management application
    When user clicks on CRM Management>>Users>>test with mobile as  "9555104210"
    And the user verifies with data displayed
    And the user clicks Excel download
    And User clicks "Clear Filter" button
    And User Clicks "+" icon to add Users
    Then User goes to "User" title Page
    
 

    
    
 
