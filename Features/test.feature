Feature: validating borrowing estimates
  
  Scenario: Validating borrowing estimate of $479,000.
    Given User Launch Browser
    And user navigate to "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
    When Application type is Single
    And No.of.dependants is 0
    And select buying option as home to live in,
    And Enter income as $80,000
    And Enter other income as $10,000
    And Enter iving expenses $500
    And Enter current home loan repayments  as $0
    And Enter other loan repayments as $100
    And Enter other commitments as $0
    And Enter total credit card limits as $10,000
    Then click on Work out how much I could borrow button
    And validate borrowing estimate is $479,000.

  
  Scenario: Click on StartOver button
    Given user is in much-borrow page
    Then Click on Startover
    
    
 Scenario: Validate message
     Given User is on much-borrow page
     And Enter Living Expenses as 1
     Then Click on Startover
     And validate the message
 
    
    
