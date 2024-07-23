Feature: Order Management

  Scenario: Create an order with tax calculation
    Given a customer from "CA"
    And the following products exist:
      | name     | price |
      | Product1 | 100   |
      | Product2 | 200   |
    When the customer places an order with the following items:
      | product  | quantity |
      | Product1 | 1        |
      | Product2 | 2        |
    Then the order total should be 540.0