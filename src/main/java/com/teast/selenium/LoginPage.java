/* Feature: Payment Page

@Payment_Page

@validateElements
Scenario: Visibility of Payment Page Elements
Given User Should navigate to Payment Page
When Verify User is on Payment Page
Then Verify Payment Page Header is displayed 
Then Verify Select a payment method text Displayed
Then Verify Multiple payment methods is Displayed
Then verify continue button is diplayed
Then User Can Close the Browser


@validate_different_payment_methods
Scenario: Validate accessibility of different payment methods
Given User Should navigate to Payment Page
When Verify User is on Payment Page
Then Verify Multiple payment methods is Displayed
Then Verify Select different payment method accessablity
Then User Clicks On continue button
Then user should able to naviagte to next page
Then User Can Close the Browser

@validateaddcardoption
Scenario: Validate add card option in debit card payment option
Given User Should navigate to Debit/credit card payment option
When Verify User is on Debit/credit card payment option
Then click on add payment button
Then verify new pop with details displayed
Then User Can Close the Browser

@validatealreadyaddedcardoption
Scenario: Validate add added card option in debit card payment option
Given User Should navigate to previously added card option in Debit/credit card payment option
When Verify User is on Debit/credit card payment option
Then enter valid CVV
Then click on pay full payment
Then User Should be able to navigate to next page
Then User Can Close the Browser

@add_payment_card_details_Valid
Scenario: Valid card number and Valid expiry month and year User should be Able to add card details
Given User Should navigate to payment Page
When User Enters Valid card number
When User Enters Valid expiry month and year
Then User Clicks On add your card/cancel
Then User Should be able to use same card details
Then User Can Close the Browser

@Login
Scenario Outline: validate card number, expiry month and year With Invalid Creadentials
Given User Should navigate to payment Page
When User Enters invalid card number, expiry month and year
Then User should not Navigate to Main Page
Then User Can Close the Browser
Examples:
|CardNumber|ExpiryMonth|ExpiryYear|
| admin    | abc       |  a       |
| abc      | user      |  b       | 
| abc      | abc       |  c       |


@Enter valid CVV
Scenario: Validate CVV
Given User Should navigate to Page to enter CVV
When User Enters Valid CVV
Then User Clicks On Pay in full
Then User Should be able to navigate to next page
Then User Can Close the Browser

@Enter Invalid CVV
Scenario: Validate CVV with wrong CVV
Given User Should navigate to Page to enter CVV
When User Enters INvalid CVV
Then User Clicks On Pay in full
Then User Should be not be able to navigate to next page
Then User Can Close the Browser

@Enter valid OTP
Scenario: Validate OTP
Given User Should navigate to Page to enter OTP
When User Enters Valid OTP
Then User Clicks On Confirm/cancel
Then User Should be able to navigate to next page(payment sucessful)
Then User Can Close the Browser

@Enter Invalid OTP
Scenario: Validate OTP with wrong OTP
Given User Should navigate to Page to enter OTP
When User Enters Invalid OTP
Then User Clicks On Confirm/cancel
Then User Should be able get error message
Then User Can Close the Browser   */


