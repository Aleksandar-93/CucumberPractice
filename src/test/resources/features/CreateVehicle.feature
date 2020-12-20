@vehicle
Feature: Create vehicle

  As a user, I want to be able to create vehicle


  Scenario: Create vehicle
#    Given user is on the landing page
    When user logs in with "stormanager85" and "UserUser123" credentials
#    Then user navigate to "Fleet" and "Vehicle"
    And user click on create a car button
    Then user enter vehicles information:
      |Licence Plate| Driver | Location | Model Year|
      | test plate | SDET    | Washington D.C.| 2020|