Feature: Search Filter Testing

Scenario: Successful Logn
When  the user is in the CRM  page
And the user should test Search filter by passing  Name,MobileNo,CustID,LeadID,LoanNo,Email,PAN,Aadhar,with excel row "<row_index>"
 
  Examples: 
      | row_index |
      |         1 |
      |         2 | 
      |         3 |
      |         4 |
      |         5 |
      
   

    
    
 

