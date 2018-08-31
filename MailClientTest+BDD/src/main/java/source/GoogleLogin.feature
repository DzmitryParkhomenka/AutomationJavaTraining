Feature: Login to Google Email Account

  Background: 
    Given I opened Google page

  Scenario: Login to my Google Account and check that login was successful
    And I fill in login and password fields
    Then I checked that login was successfull
    Given I opened dialog to send email
    And I filled in email fields and sent email
    And I opened Sent Page to check that email was sent
    Then I checked that email was sent
    Given I logged out from Google Account
    Then I checked that logout was succesfull
