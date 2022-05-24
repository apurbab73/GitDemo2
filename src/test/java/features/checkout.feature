Feature: Checkout page

@PlaceOrder
Scenario: Checkout page Navigation

Given User is on GreenKart Home page
When User searched with "Tom" as ShortName and extracted actual name of the product
And increment quntitiy to 4
And Click Add to Cart
And Clcik Checkout Bag
And Click Proceed to Checkout
Then the checkout page is displayed
And User validates the product name in the Checkout page with the Greenkart page
And User verifies if the Apply and Place order buttons are displayed 