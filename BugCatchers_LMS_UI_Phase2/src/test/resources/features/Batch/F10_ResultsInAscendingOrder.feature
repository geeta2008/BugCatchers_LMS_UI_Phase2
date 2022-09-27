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
#@tag
Feature: Results in Ascending order

Background:
Given User is logged on to LMS website
And User is on Batch page

  @tag1
  Scenario: Verify that the results are displayed in Ascending order of Batch name
  When User clicks on the Ascending arrow (down ) near to the "Batch name" 
  Then User can see the results in Ascending order of "Batch name"
  
   @tag1
  Scenario: Verify that the results are displayed in Ascending order of batch Description
  When User clicks on the Ascending arrow (down ) near to the "Batch Description" 
  Then User can see the results in Ascending order of "Batch Description"
    
    @tag1
  Scenario: Verify that the results are displayed in Ascending order of Batch Status
  When User clicks on the Ascending arrow (down ) near to the "Batch Status" 
  Then User can see the results in Ascending order of "Batch Status"
  
     @tag1
  Scenario: Verify that the results are displayed in Ascending order No of Classes
  When User clicks on the Ascending arrow (down ) near to the "No Of Classes"
  Then User can see the results in Ascending order of "No of Classes"
  
     @tag1
  Scenario: Verify that the results are displayed in Ascending order of Program Name
  When User clicks on the Ascending arrow (down ) near to the "Program Name"
  Then User can see the results in Ascending order of "Program Name"
  

 
    
