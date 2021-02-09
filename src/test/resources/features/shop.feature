Feature: verify items in the cart

  @Add_cart
  Scenario: validate the cart
    Given User is in the home page
    Then user navigate to "shop"
    Then user buy Funny Cow 2 times
    Then user buy Fluffy Bunny 1 time
    And user navigate to "cart"
    Then user verify "Funny Cow" and "Fluffy Bunny" in the cart
