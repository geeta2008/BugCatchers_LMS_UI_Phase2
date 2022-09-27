@Functional
Feature: Manage User page
  Verify the following on Manage User page
  Heading, footer, table header, Delete icon

  @Smoke
  Scenario: Verify landing in Manage User page
    Given User logs in to LMS website
    When User clicks on the User tab
    Then User should be on "Manage User" page
    And User should see the text in footer "In total there are 4 users."

  
  Scenario: Verify sort functionality in table header
    Given User is on Manage User page
    When User clicks on sort icon in table header
    Then Table rows should be sorted

  
  Scenario: Verify check the checkbox in table header
    Given User is on Manage User page
    When User checks empty checkbox in header
    Then Check box in all the rows of user table should be checked

  Scenario: Verify uncheck the checkbox in table header
    Given User is on Manage User page
    When User unchecks the checkbox in header
    Then Check box in all the rows of user table should be unchecked
  Scenario: Verify the behavior of delete icon when no rows are checked
    Given User is on Manage User page
    When User do not check any row checkbox
    Then Delete icon at the top left corner of the user table should be disabled

  Scenario: Verify the behavior of delete icon when any user row is checked
    Given User is on Manage User page
    When User checks the row in user table
    Then Delete icon at the top left corner of the user table should be enabled

  #Scenario: Verify the behaviour of Delete icon when a row is checked
   # Given User checks the row in user table
    #When User clicks the delete icon at the top left corner of user table
   # Then Confirm dialog box should be displayed

  Scenario: Verify the Confirm dialog box by selecting No
    Given User is on confirm dialog box after clicking delete icon
    When User clicks the close(x) icon
    Then Confirm dialog box should be closed

  Scenario: Verify the Confirm dialog box by selecting Yes
    Given User is on confirm dialog box after clicking delete icon
    When User clicks the Yes icon
    Then Selected rows should be deleted with popup message "Users deleted"
