Feature: NavigationMenu
  Background:
    Given User is on the Home page

  Scenario Outline: Navigate to a destination through the top left menu
    When User click the top left navigation menu icon
    Then Destination menu cards should be displayed
      |West|
      |Southwest|
      |Midwest|
      |Northeast|
      |Southeast|
    And  User clicks the "<Destination>" menu card
    Then User is navigated to the "<Destination>" page
    Examples:
      |Destination|
      |West|