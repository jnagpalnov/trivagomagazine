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

  Scenario Outline: User should be able to navigate to article page using view destinations filters
    Given User clicks the search icon
    Then Destinations filters under "VIEW DESTINATION" heading should be displayed
      |All Destinations|
      |Canada|
      |Europe|
      |International|
      |Mexico & the caribbean|
    And User click the "<search-filter>"
    Then Search results should contain articles for the "<search-filter>"
    Examples:
      |search-filter|
      |All Destinations|
      |Canada|
      |Europe|
      |International|
      |Mexico & the caribbean|


  Scenario Outline: User should be able to navigate to article page using view recommended tags
    Given User clicks the search icon
    Then Recommended tags under "RECOMMENDED TAGS" heading should be displayed
      |Adult Only Resorts|
      |All Themes|
      |All-Inclusive Resort|
      |Arts & Culture|
      |Best US Cities To Visit|
    And User click the "<recomended-tag>" tag
    Then Search results should contain articles for the "<recomended-tag>" tag
    Examples:
      |Adult Only Resorts|
      |All Themes|
      |All-Inclusive Resort|
      |Arts & Culture|
      |Best US Cities To Visit|


