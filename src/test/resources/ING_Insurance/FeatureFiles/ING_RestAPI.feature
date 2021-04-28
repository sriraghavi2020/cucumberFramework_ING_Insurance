Feature: ING RestApi calls
@GetCall
Scenario: Get Call
Given The base Uri is http://localhost:3000
Then The request URI is /INGCarInsurance
Then Hit the API with get call
Then Get the response from call and store in file \CarInsurance\RestAPI_Response.txt

@PostCall
Scenario: Post Call
Given The base Uri is http://localhost:3000
Then The request URI is  /INGCarInsurance
Then jsonBody for post call request
	|Key		  |Value				|
	|id			  |carID3				|
	|Car Name	  |2014 Mitsubishi ASX	|
    |Type		  |SUV					|
    |Transmission |Automatic			|
    |Fuel Type	  |Petrol				|
    |Colour		  |Black				|
    |Customer_Name|KK					|

Then Hit the API with Post call request

@PostCallWithExample
Scenario Outline:: Post call with example
Given The base Uri is http://localhost:3000
Then The request URI is  /INGCarInsurance
Then jsonBody for post call request <id> <Car Name> <Type> <Transmission> <Fuel Type> <Colour> <Customer_Name>
Then Hit the API with Post call request
Then Store the post call response in file \CarInsurance\RestAPI_Response.txt
Examples: 
|id		|Car Name			|Type|Transmission|Fuel Type|Colour|Customer_Name|
|carID4 |2018 Mitsubishi ASX|SUV |Automatic	  |Petrol	|White |Simon			 |


@DeleteCall
Scenario Outline: Delete call
Given The base Uri is http://localhost:3000
Then The request URI is  /INGCarInsurance
Then jsonBody for delete call request <id> 
Then Hit the API with delete call request <id>
Then Store the delete call response in file \CarInsurance\RestAPI_Response.txt <id>
Examples:
|id|
#|nKjJ1jt|
|UEA1dIb|

