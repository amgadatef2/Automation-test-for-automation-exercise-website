@Test
Feature: F03_login |User log_ed out

  Scenario: log_out
    When Click on Signup  Login button
    And Enter vaild email address
    And Enter vaild password
    And click login button
    Then Home page is opened

#    When login As Useris Appeard
    And  user clicks on log_out button
#    Then user should be in login-setup page





