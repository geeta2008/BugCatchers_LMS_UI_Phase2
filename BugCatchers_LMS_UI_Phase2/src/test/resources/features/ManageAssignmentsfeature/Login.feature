
@tag
Feature: Validate login function

  @tag1
  Scenario: Validate login functionality of LMS
    Given User is on the Login Page
    When User enter Username,Password and click login button
    Then User should see the LMS Home page.
    
  
  @tag1
  Scenario: Validate login functionality of LMS
    Given User is on the Login Page
    When User without Username,Password and click login button
    Then User stay on the LMS Login page.  

 