Feature: ING car insurance page testing 
Scenario: ING Car Insurance

Given User is on home page
Then User goes for car insurance 
Then User start with get a quote
Then User Agree and Continues to next step
Then User enters postcode and address
|PostCode|Address|
|3195|84 Branagan Drive| 
Then User enter car registration details
|State|RegNum|
|VIC|WWI559|
Then User confirms the registered car details and store the car details in \CarInsurance\car_Details.txt
Then User gives No for factor option
Then User select No for NonStandard Accessories
Then User selects No for modification
Then User select Comprehensive as the level of cover
Then User select Garage as the parking place at night
Then User select No Damage for unrepaired damage
Then User select Private for the usage of the car
Then User selects Up to 25000km as the average used kilometers
Then User selects No for loan on car
Then User gives the deatils of policy holder
|Title|Firstname|Surname|DOBDate|DOBMonth|DOBYear|
|Mrs	|Sue	|John	|31		|01		|1989	|
Then User selects Yes for policy holder to be the relular driver
Then User Skip the customer number page
Then User select No for comprehensive loan in last 12 months
Then User selects None for years of comprehensive car insurance
Then User selects None for years of motor insurance claims
Then User selects Rating 1 for current Rating Discount for regular driver
Then User selects No for registered owner of another car
Then User selects No for owning a home
Then User selects No for other driver younger the relugar driver
Then User selects Driver above 25 as age restriction
Then User select the start date of the policy as 15th of March 2021 
Then User gives test123@gmail.com as his email
Then User recives the quote number and prices for monthl yearly and forthnightly \CarInsurance\QuoteDetails_Num_Prices.txt