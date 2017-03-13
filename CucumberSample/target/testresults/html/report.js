$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "As a User I should be able to search for restaurants",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-for-restaurants",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@restaurantsearch"
    }
  ]
});
formatter.before({
  "duration": 3599460720,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "List of search suggestions",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-for-restaurants;list-of-search-suggestions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I type search term \u0027Ye\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should see a list of search suggestions related to \u0027Ye\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 2042193506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ye",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefs.iTypeSearchTerm(String)"
});
formatter.result({
  "duration": 1875116937,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ye",
      "offset": 54
    }
  ],
  "location": "HomePageStepDefs.iShouldSeeAListOfSearchSuggestionsRelatedTo(String)"
});
formatter.result({
  "duration": 916838651,
  "status": "passed"
});
formatter.after({
  "duration": 3300666169,
  "status": "passed"
});
});