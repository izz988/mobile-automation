Feature: As a user, i want to chaneg my password, so that i can protect my account
  Scenario: As a user, i want to be able to change my password
    Given user on the login page
    When user click on lupa password? button
    And user input "alim@gmail.com" on email field
    And user click lanjut button
    And user input new "1234567" on New Password field
    And user click confirm button
    Then user click on confirm button


