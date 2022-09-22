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
Feature: Delete Multiple Batches

Background: Select Batch
Given User is on Batch page
When User selects more than one ie "4" Batch using checkbox
Then Batches gets selected
And User clicks on Delete button

  @tag1
  Scenario Outline: Validate Edit button.
    When User clicks on "<ClickOnButton>"
    Then User is on Batch page searches for selected Batch name
    And User verifies that the details based on "<Result>" .
    
    
    Examples: 
   | ClickOnButton | Result |
   | No            | Records not deleted |
   | Yes           | Records deleted |

 
