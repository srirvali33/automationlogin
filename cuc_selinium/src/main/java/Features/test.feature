@tag
Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login into the stackoverflow account with correct details
    Given User navigates to stackoverflow website
    And User clicks on the login button on homepage
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the successful login page

  Scenario: Login as aauthenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
