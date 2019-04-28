$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Vignesh/WorkSpace/CucumberMavenOwnPractice/features/TagsDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Demo for Cucumber Tags in FreeCrm",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create a contact",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;create-a-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This is a contact testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_contact_testcase()"
});
formatter.result({
  "duration": 121867136,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Create a deal",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;create-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "This is a deal testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_deal_testcase()"
});
formatter.result({
  "duration": 170098,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Create a case",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;create-a-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SmokeTest"
    },
    {
      "line": 15,
      "name": "@RegressionTest"
    },
    {
      "line": 15,
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "This is a case testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_case_testcase()"
});
formatter.result({
  "duration": 198541,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search a contact",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;search-a-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressionTest"
    },
    {
      "line": 19,
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "This is a search contact testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_search_contact_testcase()"
});
formatter.result({
  "duration": 179199,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Search a deal",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;search-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest"
    },
    {
      "line": 23,
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "This is a search deal testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_search_deal_testcase()"
});
formatter.result({
  "duration": 129706,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Search a case",
  "description": "",
  "id": "demo-for-cucumber-tags-in-freecrm;search-a-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    },
    {
      "line": 31,
      "name": "@RegressionTest"
    },
    {
      "line": 31,
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "This is a search case testcase",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefTags.this_is_a_search_case_testcase()"
});
formatter.result({
  "duration": 169528,
  "status": "passed"
});
});