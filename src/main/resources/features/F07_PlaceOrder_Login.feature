@Test
Feature: Place Order: Login before Checkout
Background:
  When Click on Signup  Login button

  Scenario: PLACE_Order
#    When Click Signup _Login button
    And Fill email, password and click Login button
#    Then Verify Logged in as username at top
    When User Click on Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Click Cart button
    And Click Proceed To Checkout
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    When Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button