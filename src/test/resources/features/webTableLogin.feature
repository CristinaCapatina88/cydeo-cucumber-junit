Feature: user should be able to login and using correct credentials

Background: user is on the login page
  Given user is on the login page of web table app

  Scenario: positive Login scenario

    When user enters username "Test"
    And user enters password "Tester"
    And user clicks the login button
    Then user should see url contains orders


  Scenario: positive Login scenario

    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders
    #1 implement this spet
  #2create login method in WebTableloginPage
  #this should  have diff multiple overloaded version

  Scenario: User should be able to see all 12 months in months dropdown

    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders