@Test
  Feature: F02_login |register user could login to log into homePage

    Scenario: log in scenario
   When Click on Signup  Login button
   And Enter vaild email address
   And Enter vaild password
   And click login button
   Then Home page is opened





      Scenario Outline: Negative  scenario:
        When Click on Signup  Login button
        And Enter invaild email address "<email>"
        And Enter invaild password  "<pass>"
        And click login button
#        Then error message is diaplyed
        Examples:
          | email | pass |
          | amgad.com | 545465 |
          | hsja.cr | weqeer2 |
          | jkskj.bn | eqwrs |