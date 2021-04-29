$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ING_Insurance/FeatureFiles/APIHttpClients.feature");
formatter.feature({
  "name": "ING_insurance API Http clients",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get call in API Http clients",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Base URI for get call is http://localhost:3000",
  "keyword": "Given "
});
formatter.match({
  "location": "HttpClients_API.base_URI_for_get_call_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Request URI is /INGCarInsurance",
  "keyword": "Then "
});
formatter.match({
  "location": "HttpClients_API.request_URI_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hit api with httpClient Get call",
  "keyword": "Then "
});
formatter.match({
  "location": "HttpClients_API.Hit_api_with_httpClient_Get_call()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store the reponse in file \\CarInsurance\\HttpClientAPI_Response.txt",
  "keyword": "Then "
});
formatter.match({
  "location": "HttpClients_API.store_the_reponse_in_file(String)"
});
formatter.result({
  "status": "passed"
});
});