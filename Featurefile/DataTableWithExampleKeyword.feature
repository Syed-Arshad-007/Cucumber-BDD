@dataDriven
Feature: With examples keyword
  Scenario Outline: This is login scenario
    Given Proceed to login page
    When user enter "<Username>" and password "<Password>"
    And  clicked login button

    Examples:
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin2468 |

