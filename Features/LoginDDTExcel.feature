Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given the user is on the CRM login page
    Then the user should login by passing username and password with excel row "<row_index>"
    And User Enter OTP in EnterOTP field and click on verify OTP
    Then user goes to CRM Dashboard Page
 

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      