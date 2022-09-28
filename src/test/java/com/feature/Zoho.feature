Feature: Creating A Zoho Account

Scenario: SignupPage

Given user Launch The Url
Then user Click The Signup Button

Scenario: UserDetails
When user Enter The MailId
And user Enter The Password
And user Accept The TermsAndConditions
Then user Click The SignupForFree Button