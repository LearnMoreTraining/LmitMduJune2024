Feature: Learn More Page Automation

  @LMTI01
  Scenario: Validation UI and Alert Message
    Given user clicks the confirm box
    And user get confirm box text
    When user clicks on cancel button
    Then verify the UI text