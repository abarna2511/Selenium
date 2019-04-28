Feature: Test Facebook Smoke Scenario
  Scenario: Test Login with credentials
    Given Open Chrome and start application
    When Enter "abc@gmail.com" and "selenium@123"
    Then click on submit button to login