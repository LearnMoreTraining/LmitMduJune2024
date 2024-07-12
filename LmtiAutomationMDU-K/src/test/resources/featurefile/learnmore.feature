Feature: learn more login page validation

  @lmti01 @lmti
  Scenario Outline: error message validation
    Given user navigates to learn more homepage
    When user enters the username "<UserName>" and password "<Password>"
    And user clicks the login button
    Then user validates the error message "<ErrorMessage>"
  Examples:
    | UserName | Sample | Password | ErrorMessage |
    | abc      | h      | a123     | invalid      |
    | aravinth | a      | abc      | retry        |
    | apple    | u      | xyx      | hello        |


  @lmti02 @lmti
  Scenario: login validation
    Given user navigates to learn more homepage
    When user enters the username "LearnMore" and password "learnmore@123"
    And user clicks the login button
    Then user navigates to event managment page