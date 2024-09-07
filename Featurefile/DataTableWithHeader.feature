@dataDriven
Feature: Without examples but with dataheader
  Scenario: This is the login scenario
    Given Go to login page
    When enter the below mentioned credentials
      | Username | Password |
      | Admin    | admin123 |
    And click on the login button after entering credentials
