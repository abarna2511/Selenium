Feature: Test Facebook Smoke Scenario

  Scenario Outline: Test Login with credentials
    Given Open Chrome and start application
    When Enter "<username>" and "<password>"
    Then click on submit button to login

    Examples: 
      | username       | password    |
      | abc@gmail.com  | cucumberabc |
      | 123@gmail.com  | cucumber123 |
      | bala@gmail.com | bala123     |
