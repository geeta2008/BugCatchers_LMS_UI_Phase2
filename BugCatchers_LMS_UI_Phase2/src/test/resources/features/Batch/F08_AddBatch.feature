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
Feature: Add batch

Background:
Given User is logged on to LMS website
And User is on Batch page

    @tag1
    Scenario: validate add new batch
    When User clicks A New Batch button
    Then user can see "Batch Details" form
  
    Scenario: Empty form submission
    When User clicks A New Batch button
    And User clicks Save button without entering data
    Then User gets message 'Name is required.'
  
    Scenario: Click Cancel
    When User clicks A New Batch button
    And User clicks Cancel button
    Then User can see Batch Details form disappears.
    And  "Manage Batch" is displayed
  #
    #@tag1
    #Scenario Outline: Adding a batch
    #When User clicks A New Batch button
    #And User add "<BatchNameTxtBx>" , "<BatchDescription>" , "<ProgramNameDrpDwn>" , "<StatusRadioBtn>" , "<NoOfClassesTxtBx>" and "<ClickOnButton>" 
    #And User clicks on Save
    #Then User verifies message "Successful Batch Created"
    #
    #Examples: 
    #| BatchNameTxtBx | BatchDescription | ProgramNameDrpDwn | StatusRadioBtn | NoOfClassesTxtBx | ClickOnButton |
    #| BName01        | BDecrip01        | "2"               |  Active        | 9                | "Save"        | 
    #
      #
     #Scenario Outline: Verify Added Batch is created
     #When User searches with newly created "Batch Name"  
     #Then records of the newly created  "Batch Name" is displayed
     #
     #Examples: 
     #| BatchNameTxtBx |
     #| BName01        |