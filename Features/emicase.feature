Feature: customer Login 

  Scenario: Successful Login
    Given the user is on the Ram Fincorp login page
    When user enters Mobile Number as "7488660739"
   And the user clicks on the Login button
   And User Enter OTP in EnterOTP field 
   Then user Enters  PAN AS "EESPK0277M" and PINcode as "847203" in Enter your Pan Page
   Then user clicks Yes on PAN,NAME AND DOB match page
     When User click "bank Transfer" in  Mode of Payment page
   Then User clicks "Salaried" on  employmentDetails 
   And User enters MonthlyIncome as "50000" and click Next
  Then User enters salary date as "10"
  Then User gets userid by running qwery from db
  And user runs query of emi creation from db
  
  #And user click Continue button on Loan Selection Screen
  # When User click Continue on offerpage
   When User clicks Personal Emergency on Loan Purpose
    Then User enters Email as "mukund.kumar@ramfincorp.com" and clicks Next
  And user enters aadhar as "884626198697" and clicks Next
    Then User has to manually enter OTP and click next
    When User enter AccName as "MUKUND KUMAR",AccNo as "76327656754",cnfAc as "76327656754",ifsc as "IDIB000L508"
    And User clicks continue on emandate
 Then User enters mobileNo  as "7777777777" in ContactDetails Page
 Then user clicks on Success in Rajorpay window
#When user is on Kindly select bank account for loan disbursal page and click Continue
And User is again on emandate page and click Continue
#Given user has completed pennydrop and on verifiedbankacc for disbursal and click continue
#Then user manually select checkbox and click Continue
Given User is on KFS Page , manually selects checkbox and click continue
#Then User is on ApprovedPage and manually disburse fromCRM