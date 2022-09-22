#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Delete Single Batch.

  @tag1
  Scenario Outline: Validate single Delete for a batch.
   Given User is on Batch page
   When User  clicks on delete button.
   And User sees a pop-up
   And User clicks on "ClickOnButton"
   Then User searches for selected Batch name
   And User verifies that the details based on "<Result>" .
   
     Examples: 
   | ClickOnButton | Result |
   | No            | Records not deleted |
   | Yes           | Records deleted |
