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
  "duration": 163030061,
  "status": "passed"
});
formatter.match({
  "location": "ConsoleSteps.i_post_my_message()"
});
formatter.result({
  "duration": 30959,
  "status": "passed"
});
formatter.match({
  "location": "ConsoleSteps.view_my_timeline()"
});
formatter.result({
  "duration": 29203,
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
  "duration": 93926,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "View timeline",
  "description": "",
  "id": "post-a-message;view-timeline",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I post a message \"Does anyone like beer?\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I view my timeline",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should see \"Does anyone like beer?\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
});
});