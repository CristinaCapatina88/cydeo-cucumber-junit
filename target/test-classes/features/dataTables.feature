Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits i like
    Then user should  see fruits i like
      | kiwi     |
      | banana   |
      | cucumber |
      | orange   |


  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool (practice in class)
    Then User should see below info in month dropdown(practice in class)
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
