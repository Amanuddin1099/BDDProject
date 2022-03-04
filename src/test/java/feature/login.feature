Feature: Test login functionality
#  Scenario : validate login is successful with valid credentials
  Scenario Outline: validate login is successful with valid credentials
    Given browser is open
    When user is on login page
#    Then user enters username and password
    Then user enters <username> and <password>
    Then user clicks on login
    Then user is navigated to the home page
    Examples:
      | username | password |
      | Mehedi   | 12345    |
      | Salman   | 12345    |
      | aman     | 12345    |
      | uddin    | 12345    |
      | aziz     | 12345    |
      | mahad    | 12345    |
      | saem     | 12345    |
      | tara     | 12345    |



