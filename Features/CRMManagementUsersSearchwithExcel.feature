Feature: CRM Management Testing

  Scenario: CRMManagement
    Given the user has logged into CRM management application
    When user clicks on CRM Management>>Users>>test with Mobiledata fromExcel with  "<row_index>"
    #And the user verifies with data displayed
    
    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
    
 

    
    
 
