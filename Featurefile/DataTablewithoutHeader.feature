@dataDriven
Feature: With data header and no examples
  Scenario: This is login scenario
    Given You are on the login page
    When You enter the below credentials
      | Admin    | admin123    |
    And click  the login button
