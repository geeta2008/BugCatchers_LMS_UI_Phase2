@tag
Feature: Validating Manage Assignment and search features of Assignment in LMS 
     Background: 
          Given User is logged on to LMS website
    
 
  @tag1
  Scenario: Validate the heading,FooterText of Manage Assignment
   # Given User is logged on to LMS website
    When User is on Manage Assignment page
    Then User should see a heading with text "Manage Assignment" on the page
    And User should see the text as "Showing 1 to 3 of 3 entries".below the table 
    And User should see the footer as "In total there are 3 assignments.".
    
   @tag2
  Scenario: Validate Search Feature
  #Given User is logged on to LMS website
    When User is on Manage Assignment page
    Then Text box used for search is diplayed  
    
  @tag3
  Scenario: Validate New Assignment button
    Given User on Assignment page
    When User clicks A New Assignment button
    Then user can see Assignment details form  
    
  @tag4
  Scenario Outline: Validate Search Assignment By Name
    Given User is on Assignment page
    When User enters "<Values>" into search box 
    Then Entries for "<Values>" are displayed 

    Examples: 
     |Values|
     |Selenium Assignment|
     |SQL Practice|  