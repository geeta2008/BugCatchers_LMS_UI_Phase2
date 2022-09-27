
@tag
Feature: validating heading, footer, delete and pagination

@tag1
Scenario: validate the heading, footer showing current page entries and total programs on the table
Given user is logged on to LMS Website
When user is on program page
Then User should see a heading with text "Manage Program" on the page
And user should see the current page entries
And user should see the total programs

@tag2
Scenario: Verify previous link on the first page
Given user is logged on to LMS Website
When User is on first page of Manage Program 
Then Verify that previous link is disabled

@tag3
Scenario: Verify next link
Given User is on the page number
When User clicks navigate forward button
Then User navigated to page number


@tag4
Scenario: Verify previous link
Given User is on the current page number  
When User clicks navigate backward button
Then User navigated to previous page number

@tag5
Scenario: Verify next link on the last page
Given user is logged on to LMS Website 
When User is on last page of Manage Program 
Then Verify that next link is disabled

@tag6
Scenario: Validating the default state of Delete button 
Given user is logged on to LMS Website
When user is on program page
Then user should see the Delete button on the top left hand side as disabled 
   
@tag7
Scenario: Validating the number of records in program page
Given user is logged on to LMS Website
When user is on program page
Then user should see the number of records in program page as <5> 

    