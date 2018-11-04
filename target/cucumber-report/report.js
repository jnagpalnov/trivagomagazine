$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Search destination using search bar",
  "description": "",
  "id": "search;search-destination-using-search-bar",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User search \"\u003cDestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Search results should contain articles for \"\u003cDestination\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "search;search-destination-using-search-bar;",
  "rows": [
    {
      "cells": [
        "Destination"
      ],
      "line": 9,
      "id": "search;search-destination-using-search-bar;;1"
    },
    {
      "comments": [
        {
          "line": 10,
          "value": "#|Canada|"
        }
      ],
      "cells": [
        "Midwest"
      ],
      "line": 11,
      "id": "search;search-destination-using-search-bar;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21575666446,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSteps.navigateToHomePage()"
});
formatter.result({
  "duration": 22285410687,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#|Canada|"
    }
  ],
  "line": 11,
  "name": "Search destination using search bar",
  "description": "",
  "id": "search;search-destination-using-search-bar;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User search \"Midwest\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Search results should contain articles for \"Midwest\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Midwest",
      "offset": 13
    }
  ],
  "location": "HomePageSteps.search(String)"
});
formatter.result({
  "duration": 6639150479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Midwest",
      "offset": 44
    }
  ],
  "location": "HomePageSteps.verifySearchResults(String)"
});
formatter.result({
  "duration": 1261260793,
  "status": "passed"
});
formatter.after({
  "duration": 1322923925,
  "status": "passed"
});
});