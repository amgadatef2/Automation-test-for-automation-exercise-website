@Test
Feature: F04_AllProduct_DTAILS_appeared |all products details appeared

  Scenario: all_product
 When that home page is visible successfully
    And Click on Products button
    Then The products list is visible
    When Click on View Product of first product
    And User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand






