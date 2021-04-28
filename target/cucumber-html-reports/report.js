$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ING_Insurance/FeatureFiles/ING_RestAPI.feature");
formatter.feature({
  "name": "ING RestApi calls",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Delete call",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteCall"
    }
  ]
});
formatter.step({
  "name": "The base Uri is http://localhost:3000",
  "keyword": "Given "
});
formatter.step({
  "name": "The request URI is  /INGCarInsurance",
  "keyword": "Then "
});
formatter.step({
  "name": "jsonBody for delete call request \u003cid\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Hit the API with delete call request \u003cid\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Store the delete call response in file \\CarInsurance\\RestAPI_Response.txt \u003cid\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id"
      ]
    },
    {
      "cells": [
        "UEA1dIb"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Delete call",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteCall"
    }
  ]
});
formatter.step({
  "name": "The base Uri is http://localhost:3000",
  "keyword": "Given "
});
formatter.match({
  "location": "restAPIStepDef.The_base_Uri_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The request URI is  /INGCarInsurance",
  "keyword": "Then "
});
formatter.match({
  "location": "restAPIStepDef.The_request_URI_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "jsonBody for delete call request UEA1dIb",
  "keyword": "Then "
});
formatter.match({
  "location": "restAPIStepDef.jsonBody_for_delete_call_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hit the API with delete call request UEA1dIb",
  "keyword": "Then "
});
formatter.match({
  "location": "restAPIStepDef.Hit_the_API_with_delete_call_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store the delete call response in file \\CarInsurance\\RestAPI_Response.txt UEA1dIb",
  "keyword": "Then "
});
formatter.match({
  "location": "restAPIStepDef.Store_the_delete_call_response_in_file(String,String)"
});
formatter.result({
  "status": "passed"
});
});