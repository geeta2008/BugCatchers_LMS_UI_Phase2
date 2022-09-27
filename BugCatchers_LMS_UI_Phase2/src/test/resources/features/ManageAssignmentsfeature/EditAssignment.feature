
@tag
Feature: Validating Edit Assignment Details Of Assignment page in LMS
   Background: 
     Given User is logged on to LMS website
     And User is on Manage Assignment page
         
  @tag1
  Scenario: Validating Select Assignment Checkbox
  #Given User is on Assignment page
    When User selects Assignment using checkbox
    Then Assignment gets selected
    
  @tag2
  Scenario: Validating Edit Feature on Assignment page
  #Given User is on Assignment page
  When User clicks on <Edit> button
  Then User lands on Assignment Details form.
    
 @tag3
  Scenario Outline: Validating Save Button in Assignment Details form
  Given User clicks on <Edit> button and is on Assignment Details form
    When User edits "<Name>","<Description>","<Grade>"
    And User clicks <Save> button on Assignment Details form
    Then User can sees 'Successful Assignment Updated' message
     Examples: 
      |Name|Description|Grade|
      | Asp | Asp Assignment |90|  

  @tag4
  Scenario Outline: Validating Cancel Button in Assignment Details form
    Given User clicks on <Edit> button and is on Assignment Details form
    When User edits "<Name>","<Description>","<Grade>"
    And User clicks <Cancel> button, <Exit> button  on Assignment Details form
    Then User sees Assignment Details form disappears    
      Examples: 
      | name  | Description |Grade|
      | C| C Assignment |90|  
     

  


