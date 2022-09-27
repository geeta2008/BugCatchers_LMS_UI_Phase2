@tag
Feature: Validate Assignment Order in Assigments

  @tag1
  Scenario: Verify that the results are displayed in Ascending order 
    Given User is on Assignment Page
    When User clicks onthe <Ascending arrow> (down ) near to the Assignment name 
    And User clicks onthe <Ascending arrow> (down ) near to the Assignment Description 
    And User clicks onthe <Ascending arrow> (down ) near to the Assignment Duedate 
    And User clicks onthe <Ascending arrow> (down ) near to the Assignment Grade 
    Then User can see the results in Ascending order of Assignment name,
    And User can see the results in Ascending order of Assignment Description
    And User can see the results in Ascending order of Assignment Duedate 
    And User can see the results in Ascending order of Assignment Grade
    

   @tag2
  Scenario: Verify that the results are displayed in Descending order 
    Given User is on Assignment Page
    When User clicks onthe <Descending arrow> (down ) near to the Assignment name 
    And User clicks onthe <Descending arrow> (down ) near to the Assignment Description 
    And User clicks onthe <Descending arrow> (down ) near to the Assignment Duedate 
    And User clicks onthe <Descending arrow> (down ) near to the Assignment Grade 
    Then User can see the results in Descending order of Assignment name,
    And User can see the results in Descending order of Assignment Description
    And User can see the results in Descending order of Assignment Duedate 
    And User can see the results in Descending order of Assignment Grade