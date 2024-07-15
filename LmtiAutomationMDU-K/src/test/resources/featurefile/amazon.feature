Feature: Amazon home page validation

  Scenario: search functionaity
    When user enter the product name "iphone"
    And user clicks the login icon
    Then user validates the results
    And user validate the title

  @amazon02
  Scenario: handle the dropdown

    When extract the dropdown values
    And user selects the dropdown value

  @amazon03
  Scenario: mouse actions
    When user clicks the baby wishlist


