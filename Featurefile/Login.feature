@simpleLogin @dataDriven
Feature: simple login feature for Orange HRM
  @Positive
  Scenario: Positive scenario
    Given user is on login page
    When The user enters valid username and password
    And clicks the login button
    Then the user should be navigated to home page

    @Negative
  Scenario: Negative scenario
    Given user is on login page
    When The user enters valid username and password
    And clicks the login button
    Then the user should be navigated to home page