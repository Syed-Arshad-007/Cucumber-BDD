Feature: This is to test google search
  Scenario: Google search scenario
    Given user is entering google.co.in
    When user is typing the search term "Playwright"
    And enters the return key
    Then user should able to see results for Playwright