@tag
Feature: validating edit program 
Background: 
Given user is logged on to LMS Website   
Given user is on program page

@tag1
Scenario: user select the program  
Given user is logged on to LMS Website
When User selects Program using checkbox
Then Program gets selected

@tag2
Scenario: validating edit feature  
Given user is on program page
When User clicks on <Edit> button
Then User is on Program Details form.

@tag3
Scenario: validating edit Program name and Description
Given User is on Program Details form.
When User edits <Name> and <Description> 
Then User can see edited 'name' or 'Description'

@tag4
Scenario: validating Program Status
Given User is on Program Details form
When User changes status 
Then User can see updated Status

@tag5
Scenario: validating save button
Given user edit program details 
When User clicks <Save> button
Then User gets message 'Successful Program updated' 

@tag6
Scenario: validating cancel button
Given user edit program details 
When User clicks <cancel> button
Then User can see Program Details form disappears 
  