@Functional
Feature: Manage User - Edit or Delete icon in each row, Search and User Id

  
  Scenario: Verify the functionality of Delete icon
    Given User is on Manage User page
    When User ckicks Delete icon in the user table row
    Then Confirm dialog box should be displayed

  
  Scenario: Verify the functionality of update icon
    Given User is on Manage User page
    When User ckicks Update icon in the user table row
    Then User Details dialog box should be displayed to edit user details

  Scenario: Verify the functionality of Search
    Given User is on Manage User page
    When User enters name in the search field
    Then Rows matching with Search criteria should be displayed

  Scenario: Verify User ID link
    Given User is on Manage User page
    When User clicks on User Id link in any row
    Then A dialog box with user information should be displayed
