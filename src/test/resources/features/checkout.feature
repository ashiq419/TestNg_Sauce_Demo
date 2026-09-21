Feature: SauceDemo Complete Checkout
Scenario: Complete Checkout
Given user is on the SauceDemo login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks the login button
Then user should see the products page

When User adds product to cart
And User opens cart
And User clicks checkout
And User enters checkout details
And User clicks continue
And User clicks finish
Then User should see order confirmation