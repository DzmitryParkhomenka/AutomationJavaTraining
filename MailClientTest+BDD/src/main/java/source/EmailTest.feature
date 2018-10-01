Feature: Login to Google Email Account

  Background: 
    Given I open Google page

  Scenario Outline: Login to my Google Account and check that login was successful
    And I fill in login and password fields
    Then I check that login was successfull
    Given I open dialog to send email
    And I fill in "<To>" field, "<Subject>" field, "<Textbox>" field and sent Email
    And I open Sent Page to check that email was sent
    Then I check that email was sent and has correct "<Subject>"
    Given I log out from Google Account
    Then I check that logout was succesfull

    Examples: 
      | To                      | Subject    | Textbox      |
      | dimos-eskimos@yandex.ru | Hello      | How are you? |
      | dimos.eskimos@gmail.com | Automation | Gherkin      |
