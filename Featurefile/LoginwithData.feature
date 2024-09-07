Feature: This is a login feature for Orange HRM
  Scenario: This is login scenario
    Given user is on the login page
    When The user enters valid credentials "Admin" and "admin123"
    And clicks on the login button
    Then the user should see the home page