@smoke 
Feature: Validate user is able to Add items to cart and place order 
	In Order to validate the 
	Order placement is working fine 
	as a customer I navigate http://automationpractice.com/index.php

Scenario: validation of placeOrder for 2 Items 

	Given Iam on the home page of ecomm site "http://automationpractice.com/index.php"
	When I click on sign In Link
	And enter userid "Deepthi.Singh@gmail.com"
	And enter Password "test123" 
	Then click Submit Button 
	Then user should Login successfully and see "My account" page
	Then I click Home Button to see items to buy 
	And click ItemOne
	And click Add to cart button
	Then click continue shopping
	And click ItemTwo
	And click Add to cart button for secondItem
	Then Proceed to Checkout button
	Then I should see "2 Products" in the cart 
	Then Navigate all pages of cart summary to confirm Order and Pay
	Then I should see "Order Placement" is successful