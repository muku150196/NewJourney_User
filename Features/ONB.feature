Feature: customer Login 

  Scenario: Successful Login
    Given the user is on the Ram Fincorp login page
    When user enters Mobile Number as "7488660739"
    Then user Enters  PAN as "EESPK0277M" and PINcode as "847203" in Enter your Pan Page
    When User clicks Personal Emergency on Loan Purpose
    Then user clicks Yes on PAN,NAME AND DOB match page
    And User enters MonthlyIncome as "120000" and click Next
    Then User clicks "Salaried" on  employmentDetails 
    When User click "bank Transfer" in  Mode of Payment page
    Then User enters salary date as "19"
    And User clicks Continue
    #And User Update Bureau Table for EMI Creation
    #And User enters bankName for Finbox as "Indian Bank"
    #Then user refresh
    #Then User approves loan from CRM from Rejected Process
    And user click Continue button on Loan Selection Screen
    When User click Continue on offerpage
   Then User enters Email as "mukund.kumar@ramfincorp.com" and clicks Next
   When User enter AccNo as "50451442852",cnfAc as "50451442852",ifsc as "IDIB000L508"
   #Then User enters mobileNo  as "7777777777" in ContactDetails Page
  # Then user clicks on Success in Rajorpay window
   #And User clicks Continue
   And user enters aadhar as "884626198697" and clicks Next
   Then User has to manually enter OTP and click next
   #And User clicks Continue
    
