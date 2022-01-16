@tag
Feature:AssignmentOne

  @tag1
  Scenario Outline: Login to facebook page
    Given User is on facebook login page
    When User enters the <username>
    And User enters <password>
    Then User clicks on Login button
    Then User is navigated to hoem screen 
    Then User clicks on post functionality
    Then User enters "Hello! World" in post 
    Then User clicks on post button 
    And Post is suceesfully posted and visible on hoem screen. 

Examples:
|username | password|
|xyz      |xyz			|
|xyz1			|xyz1			|