@smartBear
Feature:SmartBear order process parameterization practice

  Scenario: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
     And User fills out the form as followed:
    When User selects FamilyAlbum from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056" to zipcode
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
   Then User verifies "John Wick" is in the list


    Scenario Outline: SmartBear order process with Scenario Outline
      Given User is logged into SmartBear Tester account and on Order page
      And User fills out the form as followed:
      When User selects "<product>" from product dropdown
      And User enters "<quantity>" to quantity
      And User enters "<customer name>" to costumer name
      And User enters "<street>" to street
      And User enters "<city>" to city
      And User enters "<state>" to state
      And User enters "<zip>" to zipcode
      And User selects "<cardType>" as card type
      And User enters "<card number>" to card number
      And User enters "<expiration date>" to expiration date
      And User clicks process button
      Then User verifies "<expected name>" is in the list


      Examples: search values we are going to be using in this scenario is as below
        | product     | quantity | customer name   | street           | city          | state  | zip  | cardType         | card number  | expiration date | expected name   |
        | MyMoney     | 1        | Steve Johns     | 5, Ringer Street | Bringtone, TX | US     | 758  | MasterCard       | 333222333222 | 02/07           | Steve Johns     |
        | FamilyAlbum | 2        | Clare Jefferson | 9, Maple Valley  | Salmon Island | Canada | 265  | Visa             | 999888777888 | 05/09           | Clare Jefferson |
        | ScreenSaver | 5        | Bob Williams    | 54 Map street    | Boston        | US     | 8956 | American Express | 123456789012 | 01/08           | Bob Williams    |
