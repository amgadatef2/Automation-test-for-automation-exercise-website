@Test
  Feature:F01_REGISTRATION |guest user could register to creat and account

 Scenario: positive scenario
    When Click on Signup -Login  button
    And Enter name
    And email address
    And Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When Fill  Title
    And  Fill Password
    And Date of birth
    And Fill details
    And FillFirst name
    And FillLast name
    And FillCompany
    And FillAddress
    And FillAddressTWO
    And FillCountry
    And FillState
    And FillCity
    And FillZip_Code
    And FillMobile_Number
    And Click Create Account button
Then  verify that account created is visible