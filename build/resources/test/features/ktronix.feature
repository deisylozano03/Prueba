Feature: Test shopping Ktronix
  Scenario: Buy a gamer chair
    Given that deisy select gamer chair
    When Deisy add to cart the product
    Then check out until payment method