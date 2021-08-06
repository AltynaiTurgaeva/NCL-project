$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/FindCruise.feature");
formatter.feature({
  "name": "Filter Cruise this is a test",
  "description": "  this test is to test if this test works right",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Client filters cruises by date on ncl.com",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "client searches for sailings on first available month",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.client_searches_for_sailings_on_first_available_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cruise counter on filter updates",
  "keyword": "And "
});
formatter.match({
  "location": "steps.cruise_counter_on_filter_updates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "filtered list of cruises is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "steps.filtered_list_of_cruises_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all displayed cruises should start on selected month",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.all_displayed_cruises_should_start_on_selected_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "number of displayed cruises should match previous counter on filter",
  "keyword": "And "
});
formatter.match({
  "location": "steps.number_of_displayed_cruises_should_match_previous_counter_on_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});