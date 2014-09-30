$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/codurance/acceptancetests/feature/ConsoleApp.feature");
formatter.feature({
  "line": 1,
  "name": "Post a message",
  "description": "",
  "id": "post-a-message",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Post message to console",
  "description": "",
  "id": "post-a-message;post-message-to-console",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have a message \"Does anyone like beer?\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I post my message",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "view my timeline",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Does anyone like beer?\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Does anyone like beer?",
      "offset": 18
    }
  ],
  "location": "ConsoleSteps.i_have_a_message(String)"
});
formatter.result({
  "duration": 743530000,
  "status": "passed"
});
formatter.match({
  "location": "ConsoleSteps.i_post_my_message()"
});
formatter.result({
  "duration": 65000,
  "status": "passed"
});
formatter.match({
  "location": "ConsoleSteps.view_my_timeline()"
});
formatter.result({
  "duration": 69000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Does anyone like beer?",
      "offset": 14
    }
  ],
  "location": "ConsoleSteps.i_should_see(String)"
});
formatter.result({
  "duration": 89000,
  "status": "passed"
});
});