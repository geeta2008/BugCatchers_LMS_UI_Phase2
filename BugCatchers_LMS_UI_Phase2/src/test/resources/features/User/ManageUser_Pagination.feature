@Functional
Feature: Manage User - Pagination
  Verify pagination links on Manage User page

  
  Scenario: Verify the pagination control
    Given User is on Manage User page
    When Manage User table has more than 5 rows
    Then Pagination control should be displayed

  
  Scenario: Verify the pagination next link functionality
    Given User is on Manage User page
    When User clicks on next link of pagination
    Then Next page should be displayed

  Scenario: Verify the pagination previous link functionality
    Given User is on Manage User page
    When User clicks on previous link of pagination
    Then Previous page should be displayed
