
Feature: Login Page Feature
  

  Scenario: Validate login page
  Given User is on login page
  Then ActiTime logo should be displayed
  
  Scenario: Login page validation with valid cred
  Given User is on login page
  When User enters valid credential
  Then User click on login button
  Then User should be navigate to dashboard
  
  