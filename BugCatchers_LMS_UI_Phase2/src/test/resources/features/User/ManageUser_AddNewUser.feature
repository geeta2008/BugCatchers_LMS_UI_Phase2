@Functional
Feature: Add New User - User Details window

 
  Scenario: Verify the functionality of Add New User button
    Given User is on Manage User page
    When User clicks Add New User button
    Then User Details dialog box should be displayed with all the input fields

  
  Scenario: Verify Address2 button on User Details window
    Given User is on user Details window
    When User clicks the button "+ Add C/O, Apt, Suite, Unit"
    Then User should see the input field with Label "Address2"

  Scenario Outline: Verify drop down on User Details window
    Given User is on user Details window
    When User clicks the "<dropdown_icon>"
    #Then User should select from the drop down menu
    Then User should select from the "<dropdown_icon>"

    Examples: 
      | dropdown_icon |
      | State         |
      | User Role     |

  Scenario: Verify the presence of input number arrows in postal code input field
    Given User is on user Details window
    When User clicks postal code input field
    Then User should see the input Number arrows in the postal code input field

  Scenario: Verify Save function on User details window with all fields empty
    Given User is on user Details window
    When User clicks save button with all input details empty
    Then User should see a message "Mandatory Fields cannot be empty"

  Scenario: Verify Submit function on User details window with valid input
    Given User is on user Details window
    When User clicks Submit button with all valid values in required fields
    Then New user should get created

  Scenario Outline: Verify Cancel button on User details window
    Given User is on user Details window
    When User clicks on "<Cancel>"
    Then User details window should be closed.

    Examples: 
      | Cancel        |
      | Cancel button |
      | Cancel icon   |
