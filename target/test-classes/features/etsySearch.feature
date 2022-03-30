@etsy
Feature: Etsy Search Functionality Title Verification


  Scenario: Etsy Title Verification
    Given user in on home page
    Then user sees title as expected

    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      Given user in on home page
      When User types Wooden Spoon in the search box
      And User clicks search button
      Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user in on home page
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title