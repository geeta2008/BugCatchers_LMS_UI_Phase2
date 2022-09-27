@tag
Feature: Validating Add New Assignment 
  Background: 
     Given User is logged on to LMS website
     And User is on Manage Assignment page
     And  User is on Assignment details form
     
 @tag1
 Scenario: Validate New Assignment form by Empty submission
#Given User is on Assignment details form
    When User clicks Save button without entering data
    Then User gets message 'Name is required'
    
  @tag2
  Scenario Outline: Validate New Assignment form 
    Given user enters "<Assignment name>"
    When  user clicks Save button
    Then User can see 'Assignment Name' saved in Assignment
    Examples:
     |Assignment name|
     |Postman|
    
    @tag3
  Scenario Outline: Validate New Assignment form 
    Given user enters "<Assignment description>","<assignment grade>"
    When  clicks Save button
    Then User get message as 'Name is required'
    Examples: 
     |Assignment description|assignment grade|
     |Painting Assmt|85 |
    
    @tag4
  Scenario Outline: Validate New Assignment form and Save button
    Given user enters "<Assignment name>","<Assignment description>","<assignment grade>"
    When clicks Save button
    Then User can see 'Successful Assignment Created' message displayed
    Examples: 
     |Assignment name|Assignment description|assignment grade|
     |Rest Assured|Rest Assured Assmt|90 |

   @tag5
   Scenario Outline: Validating Cancel Button in New Assignment form
   Given User enters "<Assignment name>","<Assignment description>","<assignment grade>" in Assignment Details form
   When User Clicks <Cancel> button
   Then User can see Assignment Details form disappears 
   Examples: 
     |Assignment name|Assignment description|assignment grade|
     |Soap|Soap Assmt|92|
   