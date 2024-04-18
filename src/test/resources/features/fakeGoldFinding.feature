Feature: Test for some functionalities

  @findbar
  Scenario: Finding the fake gold bar
    Given User is on the the website
    And User tries to find correct number
    When User find the bar
    Then Alert page open
