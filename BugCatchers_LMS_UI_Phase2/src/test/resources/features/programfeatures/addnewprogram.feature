
@tag
Feature: validating add new program 
Background:
Given user is logged on to LMS Website     
Given user is on program page

@tag1
Scenario: validating to add new program 
Given user is on program page
When User clicks A New Program button
Then User lands on Program Details form
      
@tag2
Scenario: validating with Empty form submission 
Given user is on program details 
When User clicks <Save> button without entering data
Then User will see message 'Name is required'
   
@tag3
Scenario: validating to Enter Program Name 
Given user is on program details 
When User enters <Name> in text box
Then User can see added 'Name' entered

@tag4
Scenario: validating Description and status fields of add new program
Given user is on program details 
When User enters description or  selects <Status> using radio button
Then User can see description entered and 'Active/Inactive' status selected

@tag5
Scenario: validating click save 
Given user is on program details 
When User click <Save> button
Then User get message 'Successful Program created' 

@tag6
Scenario:  validating click cancel
Given user is on program details 
When User click <cancel> button
Then User should get message ' Program Details form disappears'
