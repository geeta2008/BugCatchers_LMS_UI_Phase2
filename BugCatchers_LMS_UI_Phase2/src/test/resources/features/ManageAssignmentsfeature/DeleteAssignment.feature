@tag
Feature: Validating Delete Assignment feature Of Assignment page in LMS

     Background: 
     Given User is logged on to LMS website
     And User is on Manage Assignment page
     
  @tag1
  Scenario: Validating Delete Feature on Assignment page
 #Given User is on Assignment page
    When User clicks on <Delete> button after selecting an assignment
    Then User lands on Confirm Deletion form.

   @tag2
  Scenario: Validating Delete Feature for Multiple Assignments in Assignment page
 #Given User is on Assignment page
    When User selects more than one Assignment using checkbox
    Then Assignments get selected
    
  @tag3
  Scenario: Validating Delete Feature for Multiple Assignments in Assignment page
    Given User selected Mutliple Assignments in Assignment page
    When User clicks on <Delete> button on top left corner of the screen
    Then User lands on Confirm Deletion page.
    
    @tag4
  Scenario: Validating Yes button of Delete Feature on Assignment page
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Assignment Deleted' message
 
   @tag5
  Scenario: Validating No button of Delete Feature on Assignment page
    Given User clicks on <Delete> button
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears 
    

 
