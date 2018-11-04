Feature: Search
Background:
  Given User is on the Home page

  Scenario Outline: Search destination using search bar
    When User search "<Destination>"
    Then Search results should contain articles for "<Destination>"
    Examples:
    |Destination|
    |Canada|
    |Midwest|


