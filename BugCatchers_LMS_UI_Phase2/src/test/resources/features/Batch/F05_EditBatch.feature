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
Feature: Edit batch

Background:
Given User is logged on to LMS website

  @tag1
  Scenario Outline: Validate Edit button.
    Given User is on Batch page
    When User clicks on Edit button on first record.
    And  User lands on Batch Details form.
    And  User edits "<BatchNameTxtBx>" , "<BatchDescription>" , "<ProgramNameDrpDwn>" , "<StatusRadioBtn>" , "<NoOfClassesTxtBx>" and "<ClickOnButton>"
    And  User searches record with "<BatchNameTxtBx>"
    Then User verifies that the details based on "<BatchNameTxtBx>" , "<BatchDescription>" , "<ProgramNameDrpDwn>" , "<StatusRadioBtn>" , "<NoOfClassesTxtBx>"
    
    
    Examples: 
    | BatchNameTxtBx | BatchDescription | ProgramNameDrpDwn| StatusRadioBtn | NoOfClassesTxtBx | ClickOnButton |
     | BNameUpdate2   | BDecripUpdate2    |  JavaSel      | Inactive     | 9                     | Cancel        | 
    | BNameUpdate2   | BDecripUpdate2    |  JavaSel      | Inactive     | 9                |  Save        | 

 
