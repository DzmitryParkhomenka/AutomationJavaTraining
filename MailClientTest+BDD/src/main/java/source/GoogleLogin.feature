Feature: Login to Google Email Account

  Background: 
    Given I opened Google page

  Scenario Outline: Login to my Google Account and check that login was successful
    And I fill in login and password fields
    Then I checked that login was successfull
    Given I opened dialog to send email
    And I filled in "<To>" field, "<Subject>" field, "<Textbox>" field and sent Email
    And I opened Sent Page to check that email was sent
    Then I checked that email was sent and has correct "<Subject>"
    Given I logged out from Google Account
    Then I checked that logout was succesfull

    Examples: 
      | To                      | Subject    | Textbox      |
      | dimos-eskimos@yandex.ru | Hello      | How are you? |
      | dimos.eskimos@gmail.com | Automation | Gherkin      |
