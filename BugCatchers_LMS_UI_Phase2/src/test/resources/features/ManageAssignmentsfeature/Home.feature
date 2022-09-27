@tag
Feature: Verifying Home Screen

  @tag1
  Scenario: Visibility of the Elements Of Home Screen
    Given User is on the browser
    When User landed on the Home page after logging into the LMS website
    Then User should see a button with text "Program" on the menu bar
    And User should see button with text "Batch" on menu bar
    And User should see button with text "User" on the menu bar
    And User should see a button with text "Assignment" on menu bar
    And User should see button with text "Logout" on menu

 