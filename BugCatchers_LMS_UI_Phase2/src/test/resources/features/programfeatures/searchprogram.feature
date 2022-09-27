
@tag
Feature: search program 
Background:
Given user is logged on to LMS Website     
Given user is on program page
  @tag1
  Scenario: validate the search box text 
    Given user is logged on to LMS Website
    When user is on program page
    Then User should see search box with text as search 
    
    
  @tag2
  Scenario Outline: search program by name, description and status
    Given user is on program page
    When User enters  "name phrase" or <description phrase> or <status phrase> into search box.
    Then Entries for <name phrase> or <description phrase> or <status phrase> are shown.
    
    Examples:
    | name phrase|description phrase|status phrase|
    | allure     |||
    ||test reporting tool ||
    |||Active|
    
    