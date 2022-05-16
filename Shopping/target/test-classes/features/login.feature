Feature: LoginFeature
  This feature deals with the login functionality of the applications

  Scenario: Login with correct username and password
    Given I navigate to the login page
    When I enter the following for "<username>" and "<password>"
    Then Login should be successful
    
    Examples:
    |username|password|
    |Dinesh  |Dinesh  |


