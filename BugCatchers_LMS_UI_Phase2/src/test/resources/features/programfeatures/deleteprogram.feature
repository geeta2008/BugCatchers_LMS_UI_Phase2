
@tag
Feature: validating delete program 
Background:
Given user is logged on to LMS Website     
Given user is on program page


@tag1
Scenario: Validating the default state of Delete button 
Given User is logged on to LMS website
When user is on program page
When User should see the Delete button on the top left hand side as Disabled 

 
@tag2
Scenario: Validating Select multiple Program for deletion
Given user is on program page
When User selects more than one Program using checkbox
Then programs get selected  

@tag3
Scenario: Validating delete feature
Given user is on program page
When User clicks on <Delete> button on top left corner
Then User lands on Confirm Deletion form

@tag4
Scenario: Validating click yes
Given User is on Confirm Deletion form
When User clicks <Yes> button
Then User can see 'Successful Programs Deleted' message

@tag5
Scenario: Validating click no
Given User is on Confirm Deletion form
When User clicks <no> button
Then User can see Confirm Deletion form disappears
  