@Test
Feature: F05_Search_Product|user can search about any product

  Scenario: search_product
 When User Click on Products button
  And VERIFY THAT PRODUCT PAGE OPENED
  And Enter product name in search input and click search button
  And Verify SEARCHED PRODUCTS is visible
  Then Verify all the products related to search are visible






