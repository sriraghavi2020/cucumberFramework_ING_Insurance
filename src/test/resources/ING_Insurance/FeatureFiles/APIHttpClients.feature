Feature: ING_insurance API Http clients
Scenario: Get call in API Http clients
Given Base URI for get call is http://localhost:3000
Then Request URI is /INGCarInsurance
Then Hit api with httpClient Get call 
Then Store the reponse in file \CarInsurance\HttpClientAPI_Response.txt
 