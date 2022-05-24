Feature: Search and place the order for Products

//Scenario: Search experience for product search in both home and offers page
//Given User is on Greencart Landing page
//When User searched with Shortname "Tom" and extracted actual name of the product
//Then user searched for "Tom" shortname in offers page 
//And validate product name in offers page matches with Landing Page

@OfferPage
Scenario Outline: Search experience for product search in both home and offers page

Given User is on Greencart Landing page
When User searched with Shortname <Name> and extracted actual name of the product
Then user searched for <Name> shortname in offers page 
And validate product name in offers page matches with Landing Page

Examples:
| Name |
| Tom  |
| Beet |