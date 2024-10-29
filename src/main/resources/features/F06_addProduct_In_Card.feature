@Test
Feature: F05_Search_Product|user can search about any product

  Scenario: addProduct
 When User Click on Products button
  And Hover over first product and click Add to cart
  And Click Continue Shopping button
  And Hover over second product and click Add to cart
  And Click View Cart button
 Then Verify both products are added to Cart and Verify their prices, quantity and total price






