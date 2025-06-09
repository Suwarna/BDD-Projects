Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When Users Opens URL "https://admin-demo.nopcommerce.com/login"
    And Users enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard"
    When User Click on Log out link
    Then The Page Title Should be "Your strore. Login"
    And Close Browser
