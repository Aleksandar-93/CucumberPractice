Feature: Login
  As user, I want to be able to login with username and password
  Given user is on the login page

  @scenario1
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

  @scenario2
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

  @scenario3
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

    @Scenario_outline
    Scenario Outline: Login under different credentials as <username>
      When user enters "<username>"  and "<password>"
      Then user should be able to see Dashboard page title

      Examples:
        | username         | password   |
        | user10           | UserUser123|
        | user15           | UserUser123|
        | user22           | UserUser123|
        | user110          | UserUser123|
        | stormanager85    | UserUser123|
        | stormanager120   | UserUser123|
        | stormanager110   | UserUser123|



